package com.rizwanmushtaq.repositories;

import com.rizwanmushtaq.entities.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, String> {
}
