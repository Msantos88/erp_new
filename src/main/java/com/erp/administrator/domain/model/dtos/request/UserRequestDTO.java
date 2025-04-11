package com.erp.administrator.domain.model.dtos.request;

public class UserRequestDTO {
    private String nameUser;
    private String emailUser;
    private String password;

    public UserRequestDTO(String nameUser, String emailUser, String password) {
        this.nameUser = nameUser;
        this.emailUser = emailUser;
        this.password = password;
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
