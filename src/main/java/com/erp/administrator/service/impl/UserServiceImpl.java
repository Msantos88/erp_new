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

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;


    @Autowired
    private ProfileRepository profileRepository;

    @Override
    public UserResponseDTO createUser(UserRequestDTO requestDto) {
        User userEntity = UserMapper.toEntity(requestDto);
        Profile profileEntity = ProfileMapper.toEntity(requestDto.getProfile());

        List<Profile> profileList = profileRepository.findAll();

        for (Profile p : profileList){

           if(p.getNameProfile().equals(requestDto.getProfile().getNameProfile())){
               userEntity.setProfile(profileEntity);
               userEntity = userRepository.save(userEntity);
           }
        }

        return Utils.converterParaDTO(userEntity, profileEntity);

    }

    @Override
    public UserResponseDTO getUserById(Long id) {
        return null;
    }

    @Override
    public List<UserResponseDTO> getAllUsers() {
        return userRepository.findAll().stream().map(user -> Utils.converterParaDTO(user, user.getProfile()))
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
