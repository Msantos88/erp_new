package com.erp.administrator.domain.model.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_profile")
public class Profile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_profile", nullable = false)
    private Long idProfile;

    @Column(name = "name_profile", nullable = false)
    private String nameProfile;

    @Column(name = "description_profile", nullable = false)
    private String descriptionProfile;

    @OneToMany(mappedBy = "profile")
    private List<User> user;

    public Profile(){}

    public Profile(String nameProfile, String descriptionProfile) {
        this.nameProfile = nameProfile;
        this.descriptionProfile = descriptionProfile;
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
}
