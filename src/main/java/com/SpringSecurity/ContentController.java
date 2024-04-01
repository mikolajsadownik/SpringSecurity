package com.SpringSecurity;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller

public class ContentController {

    @GetMapping("/home")
    public String HandleWelcome(){
        return "home";
    }
    @GetMapping("/admin/home")
    public String HandleAdminHome(){
        return "admin";
    }
    @GetMapping("user/home")
    public String HandleWUserHome(){
        return "user";
    }



}
