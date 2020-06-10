package com.SpringIn28Minutes.SpringBootWebServicesRestfulin28.user;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//@Repository
@Component
public class UserDaoService {
    private static List<User> usersList=new ArrayList<>();
    private static int usersCount=3;

    //below is exiting data suppose in db
    static{
        usersList.add(new User(1,"Adam",new Date()));
        usersList.add(new User(2,"Eve",new Date()));
        usersList.add(new User(3,"jack",new Date()));

    }



    public List<User> getAllUser(){
        return usersList;
    }
    //pass user info in post request body
    //flow is:
    //post request with url---> controller--map user json request object to user java object--> pass to dao service
    public void createUser(User user){
        if(user.getId()==null){
            user.setId(++usersCount);
        }
        usersList.add(user);
    }
    public User getSingleUser(Integer id){
        for(User user: usersList){
            if(user.getId()==id)
                return user;
        }
        //exception handling
        return null;
    }
}
