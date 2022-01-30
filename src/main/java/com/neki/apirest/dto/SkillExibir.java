package com.neki.apirest.dto;

import com.neki.apirest.entity.Skill;
import com.neki.apirest.entity.UserModel;

public class SkillExibir {
	
	private Long id;
	private String name;
	private String version;
	private String description;
	private String image_url;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImage_url() {
		return image_url;
	}
	public void setImage_url(String image_url) {
		this.image_url = image_url;
	}
	public SkillExibir() {
		super();
	}
	public SkillExibir(Long id, String name, String version, String description, String image_url) {
		super();
		this.id = id;
		this.name = name;
		this.version = version;
		this.description = description;
		this.image_url = image_url;
	}
	public SkillExibir(Skill skill) {
		super();
		this.id = skill.getId();
		this.name = skill.getName();
		this.version = skill.getVersion();
		this.description = skill.getDescription();
		this.image_url = skill.getImage_url();
	}
	
	
	
}
