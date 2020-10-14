package com.tasktrack.tasktrackv0.service;

import com.tasktrack.tasktrackv0.model.Users;
import com.tasktrack.tasktrackv0.repository.UsersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersService {

    private final UsersRepo usersRepo;

    @Autowired
    public UsersService(UsersRepo usersRepo) {
        this.usersRepo = usersRepo;
    }

    public List<Users> getAllUsers() {
        return usersRepo.findAll();
    }

    public Users getUserByUsername(String username) {
        return usersRepo.findByUsername(username);
    }

    public void saveUser(Users user) {
        usersRepo.save(user);
    }

    public void deleteByUsername(String username) {
        usersRepo.deleteByUsername(username);
    }
}
