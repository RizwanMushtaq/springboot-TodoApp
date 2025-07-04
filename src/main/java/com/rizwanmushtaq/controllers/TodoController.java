package com.rizwanmushtaq.controllers;

import com.rizwanmushtaq.models.Todo;
import com.rizwanmushtaq.services.TodoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TodoController extends ApiBaseController {
  Logger logger = LoggerFactory.getLogger(TodoController.class);

  @GetMapping("/todos")
  public ResponseEntity<List<Todo>> getTodos() {
    return ResponseEntity.ok(TodoService.getTodos());
  }

  @GetMapping("/todos/{id}")
  public ResponseEntity<Todo> getTodoById(@PathVariable int id) {
    return ResponseEntity.ok(TodoService.getTodoById(id));
  }

  @PostMapping("/todos/create")
  public ResponseEntity<Todo> createTodo(@RequestBody Todo todo) {
    logger.info("Created Todo {}", todo.toString());
    return ResponseEntity.status(HttpStatus.CREATED).body(TodoService.createTodo(todo));
  }

  @PutMapping("/todos/update/{id}")
  public ResponseEntity<Todo> updateTodo(@PathVariable int id,
                                         @RequestBody Todo todo) {
    return ResponseEntity.ok(TodoService.updateTodo(id, todo));
  }

  @DeleteMapping("/todos/delete/{id}")
  public ResponseEntity<Todo> deleteTodo(@PathVariable int id) {
    return ResponseEntity.ok(TodoService.deleteTodo(id));
  }
}

