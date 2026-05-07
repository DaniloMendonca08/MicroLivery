package com.dev.microlivery.user.controller;

import com.dev.microlivery.user.DTOs.CreateUserRequest;
import com.dev.microlivery.user.DTOs.UserResponse;
import com.dev.microlivery.user.domain.User;
import com.dev.microlivery.user.service.UserService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity<UserResponse> create (@Valid @RequestBody CreateUserRequest request){
        UserResponse response = userService.create(request);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(response);

    }

    @PatchMapping("/me/disable")
    public ResponseEntity<Void> disable (){
        Long UserID = 1L; //temporary for testing purpose
        userService.disable(UserID);
        return ResponseEntity.noContent().build();
    }


}
