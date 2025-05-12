package com.erp.administrator.domain.model.dtos.response;

import com.erp.administrator.domain.model.dtos.request.UserRequestDTO;
import com.erp.administrator.domain.model.entities.User;

import java.util.List;

public class ProfileResponseDTO {

    private String nameProfile;

    private String descriptionProfile;

    private List<UserResponseDTO> users;

    public ProfileResponseDTO(){}

    public ProfileResponseDTO(String nameProfile, String descriptionProfile, List<UserResponseDTO> users) {
        this.nameProfile = nameProfile;
        this.descriptionProfile = descriptionProfile;
        this.users = users;
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

    public List<UserResponseDTO> getUsers() {
        return users;
    }

    public void setUser(List<UserResponseDTO> user) {
        this.users = user;
    }
}
