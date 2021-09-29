package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {
	
	
	@PostMapping()
	String postCall(@RequestBody Account account) {
		System.out.println("name " + account.getName());
		System.out.println("city " + account.getCity());
		System.out.println("state " +account.getState());
		System.out.println("pin " +account.getPin());
		System.out.println("BalanceAmount" +account.getBalanceAmount());
		System.out.println("Status " +account.getStatus());
		return "Account controller";
	}
	
}
