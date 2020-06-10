package com.SpringIn28Minutes.SpringBootWebServicesRestfulin28.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserResource {
    @Autowired
    private UserDaoService userDaoService;

    //1. Retrieve all users
    @GetMapping(path="/users")
    public List<User> retrieveAllUsers(){
       return userDaoService.getAllUser();
    }

    //2. create a users

    //3. retrieve single users
    @GetMapping(path="/users/{id}")
    public User getSpecificUser(@PathVariable("id")int id){
       return userDaoService.getSingleUser(id);
    }


}
