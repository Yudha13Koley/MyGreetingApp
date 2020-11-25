package com.capgemini.myapps.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.capgemini.myapps.model.Greeting;
import com.capgemini.myapps.model.User;
import com.capgemini.myapps.service.IGreetingService;

@RestController
@RequestMapping("/hello")
public class GreetingController {

	@Autowired
	private IGreetingService greetingService;

	@GetMapping("/greeting")
	public Greeting greeting(@RequestParam(value = "fname", defaultValue = "") String name,
			@RequestParam(value = "lname", defaultValue = "") String lastname) {
		User user = new User();
		if (!name.isEmpty()) {
			user.setFirstName(name);
		}
		if (!lastname.isEmpty()) {
			user.setLastName(lastname);
		}
		return greetingService.addGreeting(user);
	}
	
	@GetMapping("/greeting/{id}")
	public Greeting getGreeting(@PathVariable long id) {
		return greetingService.getGreetingById(id);
	}
}
