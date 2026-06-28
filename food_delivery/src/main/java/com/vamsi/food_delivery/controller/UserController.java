package com.vamsi.food_delivery.controller;

import com.vamsi.food_delivery.io.UserRequest;
import com.vamsi.food_delivery.io.UserResponse;
import com.vamsi.food_delivery.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/")
@AllArgsConstructor
@CrossOrigin("*")
public class UserController {

    private final UserService userService;


    @PostMapping("/register")
    @ResponseStatus(HttpStatus.CREATED)
    public UserResponse register(@RequestBody UserRequest userRequest){
        return userService.registerUser(userRequest);
    }
}
