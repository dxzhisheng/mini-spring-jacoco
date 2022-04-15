package com.example.mini.controller;

import com.example.mini.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/users")
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public String create(@RequestParam(value = "username") String username) {
        return userService.create(username);
    }
}
