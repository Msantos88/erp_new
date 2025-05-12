package com.erp.administrator.mappers;

import com.erp.administrator.domain.model.dtos.request.UserRequestDTO;
import com.erp.administrator.domain.model.dtos.response.UserResponseDTO;
import com.erp.administrator.domain.model.entities.User;

public class UserMapper {
    public static User toEntity(UserRequestDTO requestDTO){
        User user = new User();
        user.setNameUser(requestDTO.getNameUser());
        user.setEmailUser(requestDTO.getEmailUser());
        user.setPassword(requestDTO.getPassword());
        return user;
    }

    public static UserResponseDTO toDto(User user){
        UserResponseDTO responseDTO = new UserResponseDTO();
        responseDTO.setNameUser(user.getNameUser());
        responseDTO.setEmailUser(user.getEmailUser());
        responseDTO.setPassword(user.getPassword());
        responseDTO.setNameProfile(user.getProfile().getNameProfile());

        return responseDTO;

    }
}
