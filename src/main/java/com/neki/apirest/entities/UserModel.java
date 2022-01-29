package com.neki.apirest.entities;

import java.sql.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="Usuarios")
public class UserModel {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	
	@Column(name = "login")
	private String login;
	
	@Column(name = "password")
	private String password;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@Column(name = "last_login_date")
	private Date last_login_date;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	public Date getLast_login_date() {
		return last_login_date;
	}

	public void setLast_login_date(Date last_login_date) {
		this.last_login_date = last_login_date;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", login=" + login + ", password=" + password + ", last_login_date=" + last_login_date
				+ "]";
	}

	public UserModel(long id, String login, String password, Date last_login_date) {
		super();
		this.id = id;
		this.login = login;
		this.password = password;
		this.last_login_date = last_login_date;
	}

	public UserModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, last_login_date, login, password);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserModel other = (UserModel) obj;
		return id == other.id && Objects.equals(last_login_date, other.last_login_date)
				&& Objects.equals(login, other.login) && Objects.equals(password, other.password);
	}


	
	}
	
	
	
	

