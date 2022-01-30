package com.neki.apirest.repository;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.neki.apirest.entity.UserModel;

@Repository
public interface UserRepository extends JpaRepository<UserModel, Long>{

	Optional<UserModel> findById(Long id);
	
	boolean existsById(Long id);

	void deleteById(Long id);
	
	
	
}
