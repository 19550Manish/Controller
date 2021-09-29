package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping("/User")
@RestController
public class UserController { //POJO
		@GetMapping("/")
		void call() {
			System.out.println("called...");
			
		}
		@GetMapping("/{id}")
		void getUser(@PathVariable Integer id) {
			System.out.println("called..." + id);
			
			
		}
		@PostMapping
		String postcall(@RequestBody User user) { //create User class
			System.out.println("got user  " + user.getName());
			return "post called";
		}
		@PutMapping
		 String handlePutMapping() {
			return "put..";
		}
}
