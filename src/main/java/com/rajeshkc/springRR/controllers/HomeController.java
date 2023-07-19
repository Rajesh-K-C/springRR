package com.rajeshkc.springRR.controllers;


import com.rajeshkc.springRR.entities.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class HomeController {

    // GET, POST, PUT, DELETE
    @GetMapping("")
    public User getHome(){
//        return "This is a get method";

        User user = new User(1,"Rajesh", 40);

        return user;
    }

    @PostMapping("")
    public String postHome(){
        return "This is a post method";
    }
    @PutMapping("")
    public String pulHome(){
        return "This is a put method";
    }
    @DeleteMapping("")
    public String deleteHome(){
        return "This is a delete method";
    }
}
