package com.demo.rest.webservices.restfulwebservices.todo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class HardCodedTodoService {
	private static List<Todo> todos = new ArrayList<>();
	private static int idCounter = 0;
	static {
		todos.add(new Todo(++idCounter,"in28mintes","Learn to dance 2",new Date(),false));
		todos.add(new Todo(++idCounter,"in28mintes","Become full stack developer",new Date(),false));
		todos.add(new Todo(++idCounter,"adam","visit india",new Date(),false));
		todos.add(new Todo(++idCounter,"adam","maintain discipline",new Date(),false));
	}
	public List<Todo> findAll(){
//		System.out.println(todos);
//		System.out.println("Hello World");
		return todos;
	}
	public Todo DeleteTodoById(long id) {
		Todo todo = findTodoById(id);
		if(todo == null) return null;
		if(todos.remove(todo))
		return todo;
		return null;
	}
	private Todo findTodoById(long id) {
		for(Todo todo : todos) {
			if(todo.getId() == id) {
				return todo;
			}
		}
		return null;
	}
	
	public Todo updateTodo(long id){
		Todo todo = findTodoById(id);
		if(todo != null) {
			todo.setDescription("description updated");
			return todo;
		}
		return null;
	}
	
	public Todo retrieveTodo(long id) {
		Todo todo = findTodoById(id);
		if(todo != null)
			return todo;
		return null;
	}
	
	public Todo save(Todo todo) {
		if(todo.getId() == -1 || todo.getId() == 0) {
			todo.setId(++idCounter);
			todos.add(todo);
			return todo;
		}
		else {
			DeleteTodoById(todo.getId());
			todos.add(todo);
			return todo;
		}
	}
}
