package com.neki.apirest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.neki.apirest.dto.UserExibir;

import com.neki.apirest.service.UserService;


import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api")
public class UserController {

	@Autowired
	UserService userService;
	
	@GetMapping("/user")
	@ApiOperation(value = "Retorna lista de usuario")
	public ResponseEntity< List<UserExibir>> listaUser(){
		List<UserExibir> user = userService.listarTodos();
		return ResponseEntity.ok(user);
	}
}