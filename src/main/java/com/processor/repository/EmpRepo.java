package com.processor.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class EmpRepo {

	Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Transactional(rollbackFor = Exception.class)
	public void insertData() throws Exception {
		String sql = "INSERT INTO mock_data_txn (id, first_name,last_name,email,gender,ip_address) VALUES (?, ?,?,?,?,?)";

		try {
			for (int i = 0; i <= 20; i++) {
				logger.info("I -> " + i);
				jdbcTemplate.update(sql, i, "lailaaa", "majnuu", "laila@majnuu", "fe", "1234");

//				if (i == 17) {
//					throw new RuntimeException();
//				}
			}
//			throw new RuntimeException();
			throw new Exception();
		} catch (Exception ex) {
			throw ex;
		}

	}

}