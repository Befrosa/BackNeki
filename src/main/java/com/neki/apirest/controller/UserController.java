package com.neki.apirest.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.neki.apirest.dto.UserExibir;
import com.neki.apirest.entity.UserModel;
import com.neki.apirest.repository.UserRepository;
import com.neki.apirest.service.UserService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api")
@Api(value="Neki API REST")
public class UserController {

	@Autowired
	UserService userService;
	
	@Autowired
	UserRepository userRepository;
	
	
	@GetMapping
	public ResponseEntity<List<UserModel>> listarTodos(){
		HttpHeaders headers = new HttpHeaders();
		return new ResponseEntity<>(userService.findAll(), headers, HttpStatus.OK);
	}
	
	@GetMapping("/user")
	@ApiOperation(value = "Retorna lista de usuario")
	public ResponseEntity<List<UserModel>> listaUser(){
		List<UserModel> user = userService.findAll();
		return ResponseEntity.ok(user);
	}
	
//	@GetMapping("/user/{id}")
//	@ApiOperation(value = "Retorna um Usuario")
//	public ResponseEntity<Optional<UserExibir>>buscarUser(@PathVariable(value = "id") Long id) {
//
//		return UserService.UserExibir(id) ;
//	}

	
	@PostMapping("/user")
	@ApiOperation(value="Metodo para criar um usuarios")
	public UserModel create(@RequestBody UserModel userModel) {
		return userRepository.save(userModel);
		
	}
//	@PostMapping("/user")
//	@ApiOperation(value = "Metodo para criar usuario")
//	public UserModel criaProduto(@RequestBody UserModel userModel) {
//		return UserService.createUser(userModel);
//
//	}
	
}