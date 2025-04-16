package com.erp.administrator.domain.model.dtos.response;

import com.erp.administrator.domain.model.entities.Profile;

public class UserResponseDTO {

    private String nameUser;
    private String emailUser;
    private String password;
    private ProfileResponseDTO profile;

    public UserResponseDTO(){}

    public UserResponseDTO( String nameUser, String emailUser, String password, ProfileResponseDTO profile ) {
        this.nameUser = nameUser;
        this.emailUser = emailUser;
        this.password = password;
        this.profile = profile;
    }

    public ProfileResponseDTO getProfile() {
        return profile;
    }

    public void setProfile(ProfileResponseDTO profile) {
        this.profile = profile;
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public String getEmailUser() {
        return emailUser;
    }

    public void setEmailUser(String emailUser) {
        this.emailUser = emailUser;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
