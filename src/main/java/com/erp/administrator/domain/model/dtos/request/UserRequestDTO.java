package com.erp.administrator.domain.model.dtos.request;

import com.erp.administrator.domain.model.entities.Profile;

public class UserRequestDTO {
    private String nameUser;
    private String emailUser;
    private String password;

    private ProfileRequestDTO profile;

    public UserRequestDTO(){}

    public UserRequestDTO(String nameUser, String emailUser, String password, ProfileRequestDTO profile) {
        this.nameUser = nameUser;
        this.emailUser = emailUser;
        this.password = password;
        this.profile = profile;
    }

    public ProfileRequestDTO getProfile() {
        return profile;
    }

    public void setProfile(ProfileRequestDTO profile) {
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
