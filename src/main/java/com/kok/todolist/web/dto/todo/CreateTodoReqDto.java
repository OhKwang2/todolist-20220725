package com.kok.todolist.web.dto.todo;

import com.kok.todolist.domain.todo.Todo;

import lombok.Data;

@Data
public class CreateTodoReqDto {
	private boolean importance;
	private int todo;
	
	public Todo toEntity() {
		return Todo.builder()
				.importance_flag(importance ? 1:0)
				.todo_code(todo)
				.build();
	}
}