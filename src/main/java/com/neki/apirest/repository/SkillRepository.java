package com.neki.apirest.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.neki.apirest.entity.Skill;

public interface SkillRepository extends JpaRepository<Skill, Long>{

	Optional<Skill> findById(Long id);

	boolean existsById(Long id);

	void deleteById(Long id);
	
}
