package com.processor.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.processor.service.EmpService;

@RestController
public class EmpController {

	Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	EmpService empService;

	@GetMapping("/insert")
	public void insertData() {

		try {
			empService.insert();
		} catch (Exception e) {
			logger.error("ERROR AALA REEEEEEEEE");
		}
	}

}
