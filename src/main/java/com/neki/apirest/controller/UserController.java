package com.neki.apirest.controller;

import java.util.List;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.neki.apirest.dto.UserExibir;
import com.neki.apirest.dto.UserInserir;
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
		
	@PostMapping("/user")
	@ApiOperation(value="Metodo para criar um usuarios")
	public UserExibir create(@RequestBody UserInserir userInserir) {
			UserExibir userExibir = userService.criarUser(userInserir);
		return userExibir;
		
	}
	
	@DeleteMapping("/user/{id}")
	@ApiOperation(value="Deletar Usuarios")
	public ResponseEntity<Void> delete(@PathVariable Long id){
		if (! userService.deleteUser(id)) {
			return ResponseEntity.notFound().build();
		}return ResponseEntity.noContent().build();
				
	}
	
	@PutMapping("/user/{id}")
	@ApiOperation(value="Atualizar Usuario")
	public ResponseEntity<UserExibir> atualizar(@PathVariable Long id, @RequestBody UserInserir userInserir){
		UserExibir userExibir = userService.atualizarUser(id, userInserir);
		if (userExibir != null) {
			return ResponseEntity.ok(userExibir);
		}
		else { return ResponseEntity.notFound().build();
		
		}
	}
	
	@GetMapping("/login")
	public String Login(@Valid @RequestParam String login, @RequestParam String password) {
		return userService.login(login, password);
	}
	
	
	
}
	
