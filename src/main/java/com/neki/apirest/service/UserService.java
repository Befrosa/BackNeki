package com.neki.apirest.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;



import com.neki.apirest.dto.UserExibir;
import com.neki.apirest.dto.UserInserir;
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
	
	public UserExibir criarUser(UserInserir userInserir) {
		UserModel userModel = new UserModel();
		userModel.setLogin(userInserir.getLogin());
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		userModel.setPassword(passwordEncoder.encode(userInserir.getPassword()));
		userModel.setLast_login_date(LocalDate.now());
		userModel = userRepository.save(userModel);
		return new UserExibir(userModel);
	}
	
	public boolean deleteUser(Long id) {
		if (!userRepository.existsById(id)) {
		return false;	
		}
		userRepository.deleteById(id);
		return true;
	}
	
	public UserExibir atualizarUser(Long id, UserInserir userInserir) {
		UserModel userModel = new UserModel();
		if(!userRepository.existsById(id)) {
			return null;
		}
		userModel.setId(id);
		userModel.setLogin(userInserir.getLogin());
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		userModel.setPassword(passwordEncoder.encode(userInserir.getPassword()));
		userModel.setLast_login_date(LocalDate.now());
		userModel = userRepository.save(userModel);
		return new UserExibir(userModel);
	}
	
	public String login(String login, String password) {
		
		UserModel user = userRepository.findByLogin(login);
		
		if (user.getPassword().equals(password)) {
			return "Login confirmado!";
		} else {
			return "Login e/ou senha inválidos.";
		}
	}

	
}




