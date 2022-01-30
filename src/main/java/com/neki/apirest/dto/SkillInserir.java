package com.neki.apirest.dto;

public class SkillInserir {

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
	public SkillInserir() {
		super();
	}
	public SkillInserir(Long id, String name, String version, String description, String image_url) {
		super();
		this.id = id;
		this.name = name;
		this.version = version;
		this.description = description;
		this.image_url = image_url;
	}
	
	
	
}
