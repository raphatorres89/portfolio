package com.raphatorres89.portfolio.services;

import com.raphatorres89.portfolio.models.User;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public User getByEmail(String email) {
        return User.builder()
                .email("teste@teste.com")
                .username("teste")
                .password(new BCryptPasswordEncoder().encode("teste"))
                .build();
    }
}
