package com.customer_service.ticket.controller;

import com.customer_service.ticket.model.User;
import com.customer_service.ticket.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("/{id}")
    public User getUserById(@PathVariable String id){
        return this.userService.getUserById(id);
    }

    @GetMapping("/all")
    public List<User> getAllUsers(){
        return this.userService.getAllUsers();
    }
}
