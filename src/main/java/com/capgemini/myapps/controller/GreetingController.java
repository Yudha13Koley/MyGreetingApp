package com.capgemini.myapps.controller;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.capgemini.myapps.model.Greeting;

@RestController
@RequestMapping("/hello")
public class GreetingController {

	private static final String template = "Hello , %s !";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/greeting")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "Stranger") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}

	@GetMapping("/home")
	public String display() {
		return "Hello ! Welcome To Greetings App";
	}

	@PostMapping("/post")
	public Greeting sayHelloPost(@RequestBody Greeting greeting) {
		return greeting;
	}

	@PutMapping("/put/{name}")
	public Greeting sayHelloPut(@PathVariable String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}
}
