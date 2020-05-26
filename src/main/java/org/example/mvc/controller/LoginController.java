package org.example.mvc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class LoginController {

    @RequestMapping("/getUserInfo")
    public String getUserInfo(){
        return "Amberllo";
    }
}
