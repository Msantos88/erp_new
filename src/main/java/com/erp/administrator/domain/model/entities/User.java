package com.erp.administrator.domain.model.entities;


import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "tb_user")
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user", nullable = false)
    private Long idUser;
    @Column(name = "ds_name", nullable = false)
    private String nameUser;
    @Column(name = "ds_email", nullable = false)
    private String emailUser;
    @Column(name = "ds_password", nullable = false)
    private String password;
    @ManyToOne
    @JoinColumn(name = "idProfile", referencedColumnName = "id_profile")
    private Profile profile;

    @ManyToOne
    @JoinColumn(name ="idLicense", referencedColumnName = "id_license")
    private License license;

    public User(){};

    public User(Long idUser, String nameUser, String emailUser, String password, Profile idProfile) {
        this.idUser = idUser;
        this.nameUser = nameUser;
        this.emailUser = emailUser;
        this.password = password;
        this.profile = idProfile;
    }

    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
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

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }
}
