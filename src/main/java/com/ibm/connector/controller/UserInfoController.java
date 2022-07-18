package com.ibm.connector.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.connector.data.UserInfo;

@RestController
public class UserInfoController {

	@PostMapping
	public ResponseEntity<UserInfo> createLeadInSalesforce(@RequestBody UserInfo userInfo) {
		return new ResponseEntity<UserInfo>(userInfo, HttpStatus.CREATED);
	}
	
	@GetMapping("/hello")
	public String hello() {
		return "hellow world";
	}
	
	@GetMapping("/hello/test")
	public String helloTest() {
		return "hellow worldTest";
	}
}
