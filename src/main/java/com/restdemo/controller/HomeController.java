package com.restdemo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.restdemo.dto.Users;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class HomeController {

	@GetMapping("/sum")
	public int sum(@RequestParam("a") int op1, @RequestParam("b") int op2) {
		return op1 + op2;
	}

	@GetMapping("/mul/{a}/{b}")
	public int mul(@PathVariable("a") int op1, @PathVariable("b") int op2) {
		return op1 * op2;
	}

	@PostMapping("/save")
	public String saveUser(@RequestBody Users user) {
		if (user != null) {
			System.out.println(user.getUserName());
			return "Received";
		}
		return "Not Received";
	}

}
