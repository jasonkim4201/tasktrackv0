package com.tasktrack.tasktrackv0.repository;

import com.tasktrack.tasktrackv0.model.Todos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodosRepo extends JpaRepository<Todos, Long> {



}
