package com.tasktrack.tasktrackv0.repository;

import com.tasktrack.tasktrackv0.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

public interface UsersRepo extends JpaRepository<Users, Long> {

    Users findByUsername(String username);

    @Transactional
    void deleteByUsername(String username);
}
