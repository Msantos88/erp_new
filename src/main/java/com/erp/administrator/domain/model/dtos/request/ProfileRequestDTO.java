package com.erp.administrator.domain.model.dtos.request;

public class ProfileRequestDTO {
    private String nameProfile;

    private String descriptionProfile;

    public ProfileRequestDTO(String nameProfile, String descriptionProfile) {
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
