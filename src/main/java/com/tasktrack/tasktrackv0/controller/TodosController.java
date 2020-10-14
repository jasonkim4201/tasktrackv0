package com.tasktrack.tasktrackv0.controller;

import com.tasktrack.tasktrackv0.model.Todos;
import com.tasktrack.tasktrackv0.service.TodosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/todos")
public class TodosController {

    private final TodosService todosService;

    @Autowired
    public TodosController(TodosService todosService) {
        this.todosService = todosService;
    }

    @GetMapping("all")
    public List<Todos> getAllTodos() {
        return todosService.getAllTodos();
    }

}
