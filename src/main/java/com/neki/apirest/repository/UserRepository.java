package com.neki.apirest.repository;

import java.util.Optional;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.neki.apirest.entities.UserModel;

@Repository
public interface UserRepository extends JpaRepository<UserModel, Long>{

	public Optional<UserModel> findById(Long id);
}
