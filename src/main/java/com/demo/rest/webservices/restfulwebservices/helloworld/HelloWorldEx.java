package com.demo.rest.webservices.restfulwebservices.helloworld;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class HelloWorldEx {
	
	@GetMapping("/hello")
	public String hello() {
		return "Hello World";
	}
	
//	@GetMapping("/hello-bean")
//	public HelloBean helloBean() {
//		return new HelloBean(5,"abc");
//	}
	
	@GetMapping("/hello-bean")
	public WelcomeMessage helloBean() {
		return new WelcomeMessage("welcome hello world");
	}
	
	@GetMapping("/hello-bean-path/{id}/{name}")
	public HelloBean helloBeanPath(@PathVariable int id,@PathVariable String name) {
		return new HelloBean(id,name);
	}
	
	@GetMapping("/welcome-message/{name}")
	public WelcomeMessage welcomeMessage(@PathVariable String name) {
		//throw new RuntimeException("Some Error Occured! Contact Support ar ***_**");
		return new WelcomeMessage(name);
	}
}
