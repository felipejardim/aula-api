package br.com.aulaapi.services;

import br.com.aulaapi.entities.Phone;
import br.com.aulaapi.entities.User;
import br.com.aulaapi.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public List<User> searchUser(){
        return userRepository.findAll();
    }

    public User returnUser(Long id){
        return userRepository.findById(id).orElse(null);
    }

    public User createUser(User user){
        User u = userRepository.save(user);
        return u;
    }

    public User updateUser(User user){
        return userRepository.save(user);
    }

    public Boolean deleteUser (long id){
        userRepository.deleteById(id);
        User u = userRepository.findById(id).orElse(null);
        return u == null?true:false;
    }
}
