package com.devFlow.devFlow.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @RequestMapping("/user")

    public String user() {
        System.out.println("Feature change for testing purposes");
        return "User endpoint reached!";
    }
}
