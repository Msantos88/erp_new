package com.erp.administrator.service.interfaces;

import com.erp.administrator.domain.model.dtos.request.ProfileRequestDTO;
import com.erp.administrator.domain.model.dtos.response.ProfileResponseDTO;
import com.erp.administrator.domain.model.entities.Profile;

import java.util.List;

public interface ProfileService {

    ProfileResponseDTO createProfile(ProfileRequestDTO requestDTO);

    List<ProfileResponseDTO> getAllProfiles();
}
