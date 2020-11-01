package com.demo.rest.webservices.restfulwebservices.helloworld;

import lombok.Data;

@Data
public class HelloBean {
	int id;
	String name;
	public HelloBean(int id, String name) {
		this.id = id;
		this.name = name;
	}
}
