package com.neki.apirest.dto;

import java.util.Date;

import com.neki.apirest.entity.UserModel;

public class UserExibir {
			
		private Long id;
		private Date last_login_date;
		private String login;
		
		
		public UserExibir() {
			super();
		}


		public UserExibir(Long id, Date last_login_date, String login, String password) {
			super();
			this.id = id;
			this.last_login_date = last_login_date;
			this.login = login;
			
		}
		public UserExibir(UserModel user) {
			super();
			this.id = user.getId_user();
			this.last_login_date = user.getLast_login_date();
			this.login = user.getLogin();
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


		
		
	

}
