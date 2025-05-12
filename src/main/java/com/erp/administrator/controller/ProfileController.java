package com.erp.administrator.controller;

import com.erp.administrator.domain.model.dtos.request.ProfileRequestDTO;
import com.erp.administrator.domain.model.dtos.response.ProfileResponseDTO;
import com.erp.administrator.service.impl.ProfileServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/profile")
public class ProfileController {

    @Autowired
    private ProfileServiceImpl service;

    @PostMapping("/savedProfile")
    public ResponseEntity<ProfileResponseDTO> createProfile(@RequestBody ProfileRequestDTO requestDTO){
        ProfileResponseDTO responseDTO = service.createProfile(requestDTO);
        return ResponseEntity.ok(responseDTO);
    }


}
