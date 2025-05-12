package com.erp.administrator.service.impl;

import com.erp.administrator.domain.model.dtos.request.UserRequestDTO;
import com.erp.administrator.domain.model.dtos.response.UserResponseDTO;
import com.erp.administrator.domain.model.entities.Profile;
import com.erp.administrator.domain.model.entities.User;
import com.erp.administrator.mappers.ProfileMapper;
import com.erp.administrator.mappers.UserMapper;
import com.erp.administrator.repository.ProfileRepository;
import com.erp.administrator.repository.UserRepository;
import com.erp.administrator.service.interfaces.UserService;
import com.erp.administrator.utils.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private ProfileRepository profileRepository;
    @Autowired
    private ProfileServiceImpl profileService;

    @Override
    public UserResponseDTO createUser(UserRequestDTO requestDto) {
        User userEntity = UserMapper.toEntity(requestDto);
        List<Profile> profileList = profileRepository.findAll();
        List<UserResponseDTO> users = this.getAllUsers();

        for (Profile p : profileList){
            if(p.getNameProfile().equals(requestDto.getProfile().getNameProfile())){
                userEntity.setProfile(p);
                userEntity = userRepository.save(userEntity);
            }
        }

        return Utils.converterParaDTO(userEntity);
    }

    @Override
    public UserResponseDTO getUserById(Long id) {
        List<User> users = userRepository.getByIdUser(id);
         return UserMapper.toDto(users.get(0));
    }

    @Override
    public List<UserResponseDTO> getAllUsers() {
        List<User> listUser = userRepository.findAll();

        if(listUser.isEmpty()){
            throw new IllegalArgumentException("Lista é vazia");
        }

        return listUser.stream()
                .map(UserMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public UserResponseDTO updateUser(Long id, UserRequestDTO requestDto) {
        List<User> userEntitys = userRepository.getByIdUser(id);
        if(userEntitys == null || userEntitys.isEmpty()){
            throw new IllegalArgumentException("Nenhum user encontrato para o idUser: " + id);
        }
        Profile profile = new Profile();
        profile.setNameProfile(requestDto.getProfile().getNameProfile());

        User user = userEntitys.get(0);
        user.setNameUser(requestDto.getNameUser());
        user.setEmailUser(requestDto.getEmailUser());
        user.setPassword(requestDto.getPassword());
        user.setProfile(profile);

        return UserMapper.toDto(user);
    }

    @Override
    public void deleteUser(Long id) {
        //TODO: Desenvolver Lógica para deletar
    }






}
