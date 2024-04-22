package com.customer_service.ticket.service;

import com.customer_service.ticket.model.User;
import com.customer_service.ticket.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public User getUserById(String id){
        return this.userRepository.findById(id).orElse(null);
    }

    public List<User> getAllUsers(){
       return this.userRepository.findAll();
    }
}
