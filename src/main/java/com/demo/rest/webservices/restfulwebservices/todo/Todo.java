package com.demo.rest.webservices.restfulwebservices.todo;

import java.util.Date;

import lombok.Data;

@Data
public class Todo {
	private long id;
	private String username;
	private String description;
	private Date targetDate;
	private boolean isDone;
	public Todo(long id, String username, String description, Date targetDate, boolean isDone) {
		super();
		this.id = id;
		this.username = username;
		this.description = description;
		this.targetDate = targetDate;
		this.isDone = isDone;
	}
	
}
