package com.erp.administrator.repository;

import com.erp.administrator.domain.model.entities.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfileRepository extends JpaRepository<Profile, Long> {


}
