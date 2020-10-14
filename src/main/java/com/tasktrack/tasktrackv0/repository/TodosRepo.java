package com.tasktrack.tasktrackv0.repository;

import com.tasktrack.tasktrackv0.model.Todos;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface TodosRepo extends JpaRepository<Todos, Long> {



}
