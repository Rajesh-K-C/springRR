package com.rajeshkc.springRR.services;


import com.rajeshkc.springRR.entities.User;
import com.rajeshkc.springRR.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
//    private  List<User> users = new ArrayList<>();
    @Autowired
    UserRepository userRepository;
    public String addUser(User user){
//        users.add(user);
        userRepository.save(user);
        return "User added";
    }

    public User getUser(int id){
//        for(User user1: users)
//        {
//            if (id == user1.getId()){
//                return user1;
//            }
//        }
//        return null;
        return userRepository.findById(id).get();
    }

    public String updateUser(User user){
        if (userRepository.findById(user.getId()).isPresent())
        {
            userRepository.save(user);
            return "Updated";
        }
//        for(User user1: users)
//        {
//            if (user.getId() == user1.getId()){
//                users.remove(user1);
//                users.add(user);
//                return "Updated";
//            }
//        }
        return "User not found";
    }
    public String deleteUser(int id){
//        for(User user1: users)
//        {
//            if (id == user1.getId()){
//                users.remove(user1);
//                return "deleted";
//            }
//        }

        if (userRepository.findById(id).isPresent())
        {
            userRepository.delete(getUser(id));
            return "Deleted";
        }
        return "User not exist";
    }
    public List<User> getAllUser(){
        return userRepository.findAll();
    }
}
