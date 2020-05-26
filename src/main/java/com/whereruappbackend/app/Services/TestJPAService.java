package com.whereruappbackend.app.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.whereruappbackend.app.JPA_Repositories.TestJPARepository;
import com.whereruappbackend.app.SQLTables.Test;

@Service
public class TestJPAService {
	
	@Autowired
	TestJPARepository testJPA;
	
	public List<Test> getTestObj() {
		return testJPA.findAll();
	}
	public void AddName(String name) {
		Test test=new Test();
		test.setName(name);
		testJPA.saveAndFlush(test);
	}
}
