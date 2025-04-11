package com.erp.administrator.mappers;

import com.erp.administrator.domain.model.dtos.request.UserRequestDTO;
import com.erp.administrator.domain.model.entities.User;

public class UserMapper {

    public static User toEntity(UserRequestDTO requestDTO){
        User user = new User();
        user.setNameUser(requestDTO.getNameUser());
        user.setEmailUser(requestDTO.getEmailUser());
        user.setPassword(requestDTO.getPassword());
        return user;
    }
}
