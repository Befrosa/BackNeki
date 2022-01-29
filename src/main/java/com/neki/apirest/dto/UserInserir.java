package com.neki.apirest.dto;


import java.util.Date;

import com.neki.apirest.entity.UserModel;

public class UserInserir {
	
	private Long id;
	private Date last_login_date;
	private String login;
	private String password;
	
	
	public UserInserir() {
		super();	}


	public UserInserir(Long id, Date last_login_date, String login, String password) {
		super();
		this.id = id;
		this.last_login_date = last_login_date;
		this.login = login;
		this.password = password;
	}
	public UserInserir(UserModel user) {
		super();
		this.id = user.getId();
		this.last_login_date = user.getLast_login_date();
		this.login = user.getLogin();
		this.password = user.getPassword();
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Date getLast_login_date() {
		return last_login_date;
	}


	public void setLast_login_date(Date last_login_date) {
		this.last_login_date = last_login_date;
	}


	public String getLogin() {
		return login;
	}


	public void setLogin(String login) {
		this.login = login;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
