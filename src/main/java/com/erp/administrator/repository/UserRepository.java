package com.erp.administrator.repository;

import com.erp.administrator.domain.model.dtos.response.UserResponseDTO;
import com.erp.administrator.domain.model.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    List<User> getByIdUser(Long idUser);

}
