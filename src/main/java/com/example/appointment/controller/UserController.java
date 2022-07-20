package com.example.appointment.controller;

import com.example.appointment.exception.ResourceNotFoundException;
import com.example.appointment.model.User;
import com.example.appointment.repository.UserRepository;
import com.example.appointment.security.CurrentUser;
import com.example.appointment.security.UserPrincipal;
import com.example.appointment.util.CookieUtils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/user/me")
    @PreAuthorize("hasRole('USER')")
    public User getCurrentUser(@CurrentUser UserPrincipal userPrincipal) {
    	logger.info("userPrincipal "+userPrincipal.getName());
        return userRepository.findById(userPrincipal.getId())
                .orElseThrow(() -> new ResourceNotFoundException("User", "id", userPrincipal.getId()));
    }
}
