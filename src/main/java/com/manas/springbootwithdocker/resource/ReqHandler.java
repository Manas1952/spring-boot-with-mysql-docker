package com.manas.springbootwithdocker.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/all")
public class ReqHandler {
    @Autowired
    private UserService userService;

    @GetMapping("/")
    public List<Users> getAll() {
        return userService.all();
    }

    @GetMapping("/create")
    public List<Users> createUser() {

        return userService.saveUser();
    }
}
