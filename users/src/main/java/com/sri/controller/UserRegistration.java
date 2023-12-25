package com.sri.controller;

import com.sri.entity.Users;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("user")
public class UserRegistration {

    //Logger logger= LogFactory.getFactory();

@PostMapping("/saveUsers")
    public  String saveUsers(@RequestParam Users users){


        return "";
    }


    @GetMapping("/getUsers")
    public  String getUsers(){


        return "User";
    }

}
