package com.poecat.enduringsm.service;

import com.poecat.enduringsm.model.User;
import com.poecat.enduringsm.model.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UserService extends UserDetailsService {
    User save(UserRegistrationDto registrationDto);
    List<User> getAll();
}
