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
    private List<User> users;

    public Profile(){}

    public Profile(Long idProfile, String nameProfile, String descriptionProfile, List<User> user) {
        this.idProfile = idProfile;
        this.nameProfile = nameProfile;
        this.descriptionProfile = descriptionProfile;
        this.users = user;
    }

    public Long getIdProfile() {
        return idProfile;
    }

    public void setIdProfile(Long idProfile) {
        this.idProfile = idProfile;
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

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
