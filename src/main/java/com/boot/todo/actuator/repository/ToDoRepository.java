package com.boot.todo.actuator.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.boot.todo.actuator.model.ToDo;

@Repository
public interface ToDoRepository extends CrudRepository<ToDo, String> {
	public long countByCompleted(boolean completed);
}