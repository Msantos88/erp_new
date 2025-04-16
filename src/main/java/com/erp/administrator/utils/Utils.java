package com.erp.administrator.utils;

import com.erp.administrator.domain.model.dtos.response.ProfileResponseDTO;
import com.erp.administrator.domain.model.dtos.response.UserResponseDTO;
import com.erp.administrator.domain.model.entities.Profile;
import com.erp.administrator.domain.model.entities.User;

public class Utils {

    public static ProfileResponseDTO EntityToDTO(Profile entity){

        ProfileResponseDTO responseDTO = new ProfileResponseDTO();

        responseDTO.setNameProfile(entity.getNameProfile());
        responseDTO.setDescriptionProfile(entity.getDescriptionProfile());

        return responseDTO;
    }

    public static UserResponseDTO converterParaDTO(User userEntity, Profile profileEntity){
        UserResponseDTO responseDTO = new UserResponseDTO();
        responseDTO.setNameUser(userEntity.getNameUser());
        responseDTO.setEmailUser(userEntity.getEmailUser());
        ProfileResponseDTO profileResponseDTO = new ProfileResponseDTO();
        profileResponseDTO.setNameProfile(profileEntity.getNameProfile());
        profileResponseDTO.setDescriptionProfile(profileEntity.getDescriptionProfile());

        responseDTO.setProfile(profileResponseDTO);

        return responseDTO;

    }
}
