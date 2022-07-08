package br.com.aulaapi.controllers;

import br.com.aulaapi.entities.User;
import br.com.aulaapi.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping
    @ResponseBody
    public List<User> searchUser(){
        return userService.searchUser();
    }

    @PostMapping()
    public User createUser(@RequestBody User user){
        return userService.createUser(user);
    }
}
