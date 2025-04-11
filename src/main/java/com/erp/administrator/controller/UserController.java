package com.erp.administrator.controller;

import com.erp.administrator.domain.model.dtos.request.UserRequestDTO;
import com.erp.administrator.domain.model.dtos.response.UserResponseDTO;
import com.erp.administrator.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    @PostMapping
    public ResponseEntity<UserResponseDTO> createUser(@Validated @RequestBody UserRequestDTO requestDTO){
        UserResponseDTO responseDTO = userService.createUser(requestDTO);
        return ResponseEntity.ok(responseDTO);
    }

    @GetMapping
    public ResponseEntity<List<UserResponseDTO>> getAllUser(){
        List<UserResponseDTO> users = userService.getAllUsers();
        return ResponseEntity.ok(users);
    }

}
