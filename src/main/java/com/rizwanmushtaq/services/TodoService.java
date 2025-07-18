package com.rizwanmushtaq.services;

import com.rizwanmushtaq.models.Todo;
import com.rizwanmushtaq.repositories.TodoRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public abstract class TodoService {
  public static List<Todo> getTodos() {
    List<Todo> todos = new ArrayList<>();
    return TodoRepository.getTodos();
  }

  public static Todo getTodoById(int id) {
    return TodoRepository.getTodoById(id);
  }

  public static Todo createTodo(Todo todo) {
    return TodoRepository.createTodo(todo);
  }

  public static Todo updateTodo(int id, Todo todo) {
    return TodoRepository.updateTodo(id, todo);
  }

  public static Todo deleteTodo(int id) {
    return TodoRepository.deleteTodo(id);
  }
}
