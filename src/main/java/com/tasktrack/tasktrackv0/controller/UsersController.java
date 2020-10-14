package com.tasktrack.tasktrackv0.controller;

import com.tasktrack.tasktrackv0.model.Users;
import com.tasktrack.tasktrackv0.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/users")
public class UsersController {

    private final UsersService usersService;

    @Autowired
    public UsersController(UsersService usersService) {
        this.usersService = usersService;
    }

    @GetMapping("all")
    public List<Users> getAllUsers() {
        return usersService.getAllUsers();
    }

    @GetMapping("{username}")
    public Users getUserByUsername(@PathVariable String username) {
        return usersService.getUserByUsername(username);
    }


}
