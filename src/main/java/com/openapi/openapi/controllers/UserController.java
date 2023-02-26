package com.openapi.openapi.controllers;

import com.openapi.openapi.models.User;
import com.openapi.openapi.services.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @Operation(summary = "get user")
    @GetMapping("/users")
    public List<User> findAll(){
        List<User> result = userService.findAll();
        return result;
    }

    @Operation(summary = "create user")
    @PostMapping("/users")
    public User create(@RequestBody User user){
       User result = userService.createUser(user);
       return result;
    }

    @Operation(summary = "get user with entity")
    @GetMapping("/users1")
    public ResponseEntity<List<User>> findAllWithEntity(){
        List<User> result = userService.findAll();
        return  ResponseEntity.ok().body(result);
    }
}
