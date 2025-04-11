package com.erp.administrator.service.impl;

import com.erp.administrator.domain.model.dtos.request.UserRequestDTO;
import com.erp.administrator.domain.model.dtos.response.UserResponseDTO;
import com.erp.administrator.domain.model.entities.User;
import com.erp.administrator.mappers.UserMapper;
import com.erp.administrator.repository.UserRepository;
import com.erp.administrator.service.interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;

    @Override
    public UserResponseDTO createUser(UserRequestDTO requestDto) {
        User userEntity = UserMapper.toEntity(requestDto);

        userEntity = repository.save(userEntity);

        //TODO: CRIAR MÉTODO PARA MASCARAR A SENHA
        return new UserResponseDTO(userEntity.getNameUser(), userEntity.getEmailUser(), userEntity.getPassword());
    }

    @Override
    public UserResponseDTO getUserById(Long id) {
        return null;
    }

    @Override
    public List<UserResponseDTO> getAllUsers() {
        return repository.findAll().stream().map(user -> new UserResponseDTO(user.getNameUser(), user.getEmailUser(), user.getPassword()))
                .collect(Collectors.toList());
    }

    @Override
    public UserResponseDTO updateUser(Long id, UserRequestDTO requestDto) {
        return null;
    }

    @Override
    public void deleteUser(Long id) {

    }


}
