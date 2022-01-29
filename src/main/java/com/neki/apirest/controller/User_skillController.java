package com.neki.apirest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neki.apirest.entities.User_skill;
import com.neki.apirest.repository.User_skillRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value="/api")
@Api(value="Api")
public class User_skillController {
	
	@Autowired
	User_skillRepository user_skillRepository;
	
	@GetMapping("/user_skill")
	@ApiOperation(value = "Retorna tabela link")
	public List<User_skill> listaUser_skill(){
		return user_skillRepository.findAll();
	}

}
