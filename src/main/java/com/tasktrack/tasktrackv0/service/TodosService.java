package com.tasktrack.tasktrackv0.service;

import com.tasktrack.tasktrackv0.model.Todos;
import com.tasktrack.tasktrackv0.repository.TodosRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodosService {

    private final TodosRepo todosRepo;

    @Autowired
    public TodosService(TodosRepo todosRepo) {
        this.todosRepo = todosRepo;
    }

    public List<Todos> getAllTodos() {
        return todosRepo.findAll();
    }


}
