package com.neki.apirest.dto;

import java.util.Date;

public class User_skillExibir {

	private Long id;
	private String user_id;
	private String skill_id;
	private String knowledge_level;
	private Date created_at;
	private Date updated_at;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getSkill_id() {
		return skill_id;
	}
	public void setSkill_id(String skill_id) {
		this.skill_id = skill_id;
	}
	public String getKnowledge_level() {
		return knowledge_level;
	}
	public void setKnowledge_level(String knowledge_level) {
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
	public User_skillExibir(Long id, String user_id, String skill_id, String knowledge_level, Date created_at,
			Date updated_at) {
		super();
		this.id = id;
		this.user_id = user_id;
		this.skill_id = skill_id;
		this.knowledge_level = knowledge_level;
		this.created_at = created_at;
		this.updated_at = updated_at;
	}
	public User_skillExibir() {
		super();
	}
	
	
}
