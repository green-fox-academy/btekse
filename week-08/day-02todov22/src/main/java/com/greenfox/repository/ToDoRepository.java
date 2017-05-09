package com.greenfox.repository;


import com.greenfox.model.ToDo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface ToDoRepository extends CrudRepository<ToDo, Long> {
}