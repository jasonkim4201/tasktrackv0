package com.tasktrack.tasktrackv0.controller;

import com.tasktrack.tasktrackv0.model.Users;
import com.tasktrack.tasktrackv0.service.UsersService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("http://localhost:3000")
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
    
    @PostMapping("register")
    public ResponseEntity<Users> createNewUser(@RequestBody Users user) {
        usersService.saveUser(user);
        return new ResponseEntity<>(user,HttpStatus.CREATED);
    }

    // TODO: put method to change password
    // @PutMapping("{username}/update-password)

    @DeleteMapping("{username}/delete")
    public ResponseEntity<Void> deleteUser(@PathVariable String username) {
        usersService.deleteByUsername(username);
        return ResponseEntity.noContent().build();
    }

}
