package com.whereruappbackend.app.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.whereruappbackend.app.SQLTables.Test;
import com.whereruappbackend.app.Services.TestJPAService;

@RestController
public class LoginController {
	
	@Autowired
	TestJPAService testService;
	@GetMapping("")
	private List<Test> Login() {
		testService.AddName("Louise");
		return testService.getTestObj();
	}

}
