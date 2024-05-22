package com.project.examportalbackend.services.implementation;

import com.project.examportalbackend.models.User;
import com.project.examportalbackend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {
    @Autowired
    private UserRepository userRepository;

    public void createAdmin(String username, String password) {
        User admin = new User();
        admin.setUsername(username);
        admin.setPassword(password);
        admin.setRole("ROLE_ADMIN");
        userRepository.save(admin);
    }


}
