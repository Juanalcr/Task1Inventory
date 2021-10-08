/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.task1.task1ana.services;

import com.task1.task1ana.interfaces.TodoInterface;
import com.task1.task1ana.models.Todo;
import com.task1.task1ana.repositories.TodoRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author user
 */
@Service
public class TodoService implements TodoInterface {

    @Autowired
    private TodoRepository todoRepository;
    
    @Override
    public List<Todo> getAll() {
        return todoRepository.findAll();
    }

    @Override
    public void store(Todo inventories) {
        this.todoRepository.save(inventories);
    }
    
    @Override
public Todo getById(long id) {
  Optional < Todo > optional = todoRepository.findById(id);

  if (!optional.isPresent()) {
    throw new RuntimeException(" Todo not found for id :: " + id);
  }

  Todo inventories = optional.get();
  return inventories;
}

@Override
public void delete(long id) {
  this.todoRepository.deleteById(id);
}
}
