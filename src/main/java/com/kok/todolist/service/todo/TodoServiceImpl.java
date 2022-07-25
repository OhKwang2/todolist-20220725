package com.kok.todolist.service.todo;

import javax.management.RuntimeErrorException;

import org.springframework.stereotype.Service;

import com.kok.todolist.domain.todo.Todo;
import com.kok.todolist.domain.todo.TodoRepository;
import com.kok.todolist.web.dto.todo.CreateTodoReqDto;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TodoServiceImpl implements TodoService{
	
	private final TodoRepository todoRepository;
	
	@Override
	public boolean createTodo(CreateTodoReqDto createTodoReqDto) throws Exception {
		Todo todoEntity = createTodoReqDto.toEntity();
		
		return todoRepository.save(todoEntity) > 0;
	}

}
