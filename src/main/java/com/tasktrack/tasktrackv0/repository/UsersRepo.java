package com.tasktrack.tasktrackv0.repository;

import com.tasktrack.tasktrackv0.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepo extends JpaRepository<Users, Long> {

    Users findByUsername(String username);

}
