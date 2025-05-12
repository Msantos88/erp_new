package com.erp.administrator.mappers;

import com.erp.administrator.domain.model.dtos.request.LicenseRequestDTO;
import com.erp.administrator.domain.model.dtos.response.LicenseResponseDTO;
import com.erp.administrator.domain.model.entities.License;

public class LicenseMapper {

    public static LicenseResponseDTO toDTO(License entity){
        LicenseResponseDTO response = new LicenseResponseDTO();
        response.setTypeLicense(entity.getTypeLicense());
        response.setKeyLicense(entity.getKeyLicense());
        return response;
    }

    public static License toEntity(LicenseRequestDTO request){
        License entity = new License();
        entity.setTypeLicense(request.getTypeLicense());
        entity.setKeyLicense(request.getKeyLicense());
        return entity;
    }
}
