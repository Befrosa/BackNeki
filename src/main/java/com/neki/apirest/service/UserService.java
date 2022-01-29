package com.neki.apirest.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.neki.apirest.dto.UserExibir;
import com.neki.apirest.entity.UserModel;
import com.neki.apirest.repository.UserRepository;


@Service
public class UserService {
	

	@Autowired
	private UserRepository userRepository;
	
	public List<UserModel> findAll(){
		return userRepository.findAll();
	}
	
	
	public List<UserExibir> listarTodos(){
		List<UserExibir> userExibirDto = new ArrayList<UserExibir>();
		List<UserModel> users = userRepository.findAll();
		for(UserModel user:users) {
			UserExibir Dto = new UserExibir(user);
			userExibirDto.add(Dto);
		}
		return userExibirDto;
	}
	




	


	
	
}




