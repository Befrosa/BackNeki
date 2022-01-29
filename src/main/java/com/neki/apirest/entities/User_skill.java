package com.neki.apirest.entities;

import java.sql.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="user_skill")
public class User_skill {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@OneToOne
	@JoinColumn(name="user_id")
	private UserModel user;
	
	@ManyToOne
	@JoinColumn(name="skill_id")
	private Skill skill;
	
	@Column(name = "knowledge_level")
	private long knowledge_level;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@Column(name = "created_at")
	private Date created_at;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@Column(name = "updated_at")
	private Date updated_at;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public UserModel getUser() {
		return user;
	}

	public void setUser(UserModel user) {
		this.user = user;
	}

	public Skill getSkill() {
		return skill;
	}

	public void setSkill(Skill skill) {
		this.skill = skill;
	}

	public long getKnowledge_level() {
		return knowledge_level;
	}

	public void setKnowledge_level(long knowledge_level) {
		this.knowledge_level = knowledge_level;
	}

	public Date getCreated_at() {
		return created_at;
	}

	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}

	public Date getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}

	@Override
	public String toString() {
		return "User_skill [id=" + id + ", user=" + user + ", skill=" + skill + ", knowledge_level=" + knowledge_level
				+ ", created_at=" + created_at + ", updated_at=" + updated_at + "]";
	}

	public User_skill(long id, UserModel user, Skill skill, long knowledge_level, Date created_at, Date updated_at) {
		super();
		this.id = id;
		this.user = user;
		this.skill = skill;
		this.knowledge_level = knowledge_level;
		this.created_at = created_at;
		this.updated_at = updated_at;
	}

	public User_skill() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int hashCode() {
		return Objects.hash(created_at, id, knowledge_level, skill, updated_at, user);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User_skill other = (User_skill) obj;
		return Objects.equals(created_at, other.created_at) && id == other.id
				&& knowledge_level == other.knowledge_level && Objects.equals(skill, other.skill)
				&& Objects.equals(updated_at, other.updated_at) && Objects.equals(user, other.user);
	}

	
	
	
	
	
}
