package com.erp.administrator.service.interfaces;

import com.erp.administrator.domain.model.dtos.request.ProfileRequestDTO;
import com.erp.administrator.domain.model.dtos.response.ProfileResponseDTO;

public interface ProfileService {

    ProfileResponseDTO createProfile(ProfileRequestDTO requestDTO);
}
