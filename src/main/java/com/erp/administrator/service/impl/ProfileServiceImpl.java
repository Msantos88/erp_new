package com.erp.administrator.service.impl;

import com.erp.administrator.domain.model.dtos.request.ProfileRequestDTO;
import com.erp.administrator.domain.model.dtos.response.ProfileResponseDTO;
import com.erp.administrator.domain.model.entities.Profile;
import com.erp.administrator.mappers.ProfileMapper;
import com.erp.administrator.repository.ProfileRepository;
import com.erp.administrator.service.interfaces.ProfileService;
import com.erp.administrator.utils.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfileServiceImpl implements ProfileService {

    @Autowired
    private ProfileRepository repository;

    @Override
    public ProfileResponseDTO createProfile(ProfileRequestDTO requestDTO) {

        Profile profileEntity = ProfileMapper.toEntity(requestDTO);

        profileEntity = repository.save(profileEntity);

        return Utils.EntityToDTO(profileEntity);
    }
}
