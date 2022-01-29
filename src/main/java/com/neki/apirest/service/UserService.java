package com.neki.apirest.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neki.apirest.dto.UserExibir;
import com.neki.apirest.entities.UserModel;
import com.neki.apirest.repository.UserRepository;

@Service

public class UserService {
	
	public​ List<​User​Model>​ ​listarTodos(){ 
	
	​return​ UserRepository​.​findAll();
	}
}



//	@Autowired
//	private UserRepository userRepository;
//	
//	public List<UserExibir> listarTodos(){
//		List<UserExibir> userExibirDto = new ArrayList<UserExibir>();
//		List<UserModel> users = userRepository.findAll();
//		for(UserModel user:users) {
//			UserExibir Dto = new UserExibir(user);
//			userExibirDto.add(Dto);
//		}
//		return userExibirDto;
		
//	}

