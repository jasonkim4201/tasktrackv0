package com.tasktrack.tasktrackv0.controller;

import com.tasktrack.tasktrackv0.model.Todos;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class TodosController {

    @GetMapping("todos")
    public List<Todos> getAllTodos() {
        return null;
    }


}
