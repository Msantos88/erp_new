package com.erp.administrator.mappers;

import com.erp.administrator.domain.model.dtos.request.ProfileRequestDTO;
import com.erp.administrator.domain.model.entities.Profile;


public class ProfileMapper {

    public static Profile toEntity(ProfileRequestDTO requestDTO){
        Profile profile = new Profile();
        profile.setNameProfile(requestDTO.getNameProfile());
        profile.setDescriptionProfile(requestDTO.getDescriptionProfile());
        return profile;
    }
}
