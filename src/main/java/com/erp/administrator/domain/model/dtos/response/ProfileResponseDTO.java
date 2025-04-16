package com.erp.administrator.domain.model.dtos.response;

import com.erp.administrator.domain.model.dtos.request.UserRequestDTO;
import com.erp.administrator.domain.model.entities.User;

import java.util.List;

public class ProfileResponseDTO {

    private String nameProfile;

    private String descriptionProfile;

    private List<UserRequestDTO> user;

    public ProfileResponseDTO(){}

    public ProfileResponseDTO(String nameProfile, String descriptionProfile, List<UserRequestDTO> user) {
        this.nameProfile = nameProfile;
        this.descriptionProfile = descriptionProfile;
        this.user = user;
    }

    public String getNameProfile() {
        return nameProfile;
    }

    public void setNameProfile(String nameProfile) {
        this.nameProfile = nameProfile;
    }

    public String getDescriptionProfile() {
        return descriptionProfile;
    }

    public void setDescriptionProfile(String descriptionProfile) {
        this.descriptionProfile = descriptionProfile;
    }

    public List<UserRequestDTO> getUser() {
        return user;
    }

    public void setUser(List<UserRequestDTO> user) {
        this.user = user;
    }
}
