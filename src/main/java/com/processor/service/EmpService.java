package com.processor.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.processor.repository.EmpRepo;

@Component
public class EmpService {

	@Autowired
	EmpRepo empRepo;

	public void insert() throws Exception {
		empRepo.insertData();
	}

}
