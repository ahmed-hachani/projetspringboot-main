package com.example.projetspring.services;


import com.example.projetspring.entities.Role;
import com.example.projetspring.entities.User;
import com.example.projetspring.repository.RoleRepository;
import com.example.projetspring.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class UserServiceImpl implements IUserService {
    @Autowired
    UserRepository userRepository;
    @Autowired
    RoleRepository roleRepository;


    @Override
    public List<User> retrieveAllUsers() {
        return userRepository.findAll();
    }


    @Override
    public User retrieveUser(Integer userID) {
        return userRepository.findById(userID).get();
    }

    @Override
    public User addUser(User u) {
        return userRepository.save(u);
    }

    @Override
    public User updateUser(User u) {
        return userRepository.save(u);
    }

    @Override
    public void removeUser(Integer userID) {
    User u= retrieveUser(userID);
    userRepository.delete(u);

    }

    /*@Override
    public List<User> retrieveUserByRole(Role role) {
        return userRepository.findBy;
    }*/
}
