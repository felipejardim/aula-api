package br.com.aulaapi.controllers;

import br.com.aulaapi.entities.User;
import br.com.aulaapi.services.UserService;
import org.hibernate.ObjectNotFoundException;
import org.hibernate.annotations.NotFound;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
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
    }       //ok

    //ver como faz para retornar uma mensagem de erro
    @GetMapping("/{id}")
    public User returnUser(@PathVariable(value = "id") Long id){
        return userService.returnUser(id);
    }       //ok

    @PostMapping()
    public User createUser(@RequestBody User user){
        return userService.createUser(user);
    }       //ok

    @DeleteMapping()
    public Boolean deleteUser(@RequestBody User user){ return userService.deleteUser(user.getId()); }
}
