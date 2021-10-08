/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.task1.task1ana.interfaces;

import com.task1.task1ana.models.Todo;
import java.util.List;

/**
 *
 * @author user
 */
public interface TodoInterface {
    List<Todo> getAll();
    void store(Todo inventories);
    Todo getById(long id);
    void delete(long id);
}