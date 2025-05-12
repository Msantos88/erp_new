package com.erp.administrator.domain.model.entities;


import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_license")
public class License {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_license", nullable = false)
    private Long idLicense;

    @OneToMany(mappedBy = "license")
    private List<User> users;

    @Column(name = "type_license", nullable = false)
    private String typeLicense;

    @Column(name = "key_license", nullable = false)
    private String keyLicense;

    public License(){}
    public License(Long idLicense, String typeLicense, String keyLicense) {
        this.idLicense = idLicense;
        this.typeLicense = typeLicense;
        this.keyLicense = keyLicense;
    }

    public Long getIdLicense() {
        return idLicense;
    }

    public void setIdLicense(Long idLicense) {
        this.idLicense = idLicense;
    }

    public String getTypeLicense() {
        return typeLicense;
    }

    public void setTypeLicense(String typeLicense) {
        this.typeLicense = typeLicense;
    }

    public String getKeyLicense() {
        return keyLicense;
    }

    public void setKeyLicense(String keyLicense) {
        this.keyLicense = keyLicense;
    }
}
