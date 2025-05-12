package com.erp.administrator.domain.model.dtos.response;

public class LicenseResponseDTO {

    private String typeLicense;
    private String keyLicense;

    public LicenseResponseDTO(){}
    public LicenseResponseDTO(String typeLicense, String keyLicense) {
        this.typeLicense = typeLicense;
        this.keyLicense = keyLicense;
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
