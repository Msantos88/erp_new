package com.erp.administrator.service.interfaces;

import com.erp.administrator.domain.model.dtos.request.UserRequestDTO;
import com.erp.administrator.domain.model.dtos.response.UserResponseDTO;

import java.util.List;

public interface UserService {

    UserResponseDTO createUser(UserRequestDTO requestDto);
    UserResponseDTO getUserById(Long id);
    List<UserResponseDTO> getAllUsers();
    UserResponseDTO updateUser(Long id, UserRequestDTO requestDto);
    void deleteUser(Long id);
}
