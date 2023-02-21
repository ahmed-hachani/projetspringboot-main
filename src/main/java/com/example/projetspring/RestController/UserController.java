package com.example.projetspring.RestController;


import com.example.projetspring.entities.User;
import com.example.projetspring.services.IUserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Users")
public class UserController {
    @Autowired
    IUserService userService;

    /*@GetMapping("/retrieve-all-users")
    public List<User> retrieveAllUsers*/


}
