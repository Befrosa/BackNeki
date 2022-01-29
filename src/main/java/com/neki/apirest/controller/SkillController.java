package com.neki.apirest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neki.apirest.entities.Skill;
import com.neki.apirest.repository.SkillRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;



@RestController
@RequestMapping(value="/api")
@Api(value="Api")
public class SkillController {
	
	@Autowired
	SkillRepository skillRepository;
	
	@GetMapping("/skill")
	@ApiOperation(value = "Retorna skils dos usuarios")
	public List<Skill> listaSkill(){
		return skillRepository.findAll();
	}

}
