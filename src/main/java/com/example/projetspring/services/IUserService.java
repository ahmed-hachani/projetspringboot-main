package com.example.projetspring.services;

import com.example.projetspring.entities.Role;
import com.example.projetspring.entities.User;

import java.util.List;

public interface IUserService {
public List<User> retrieveAllUsers();
public User retrieveUser(Integer userID);
public User addUser(User u);
public User updateUser(User u);
public void removeUser(Integer userID);
/*public List<User> retrieveUserByRole(Role role);*/


}
