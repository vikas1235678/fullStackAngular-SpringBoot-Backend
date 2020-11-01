package com.demo.rest.webservices.restfulwebservices.helloworld;

public class WelcomeMessage {
	private String name;
	
	WelcomeMessage(String name){
		this.name = name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}
