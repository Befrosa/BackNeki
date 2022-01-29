package com.neki.apirest.entity;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="skill")
public class Skill {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@OneToMany(mappedBy = "skill")
	private List<User_skill> user_skill = new ArrayList<>();
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "version")
	private String version;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "image_url")
	private String image_url;

	public long getId() {
		return id;
	}

	public void setId(long id) {
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

	@Override
	public String toString() {
		return "Skill [id=" + id + ", user_skill=" + user_skill + ", name=" + name + ", version=" + version
				+ ", description=" + description + ", image_url=" + image_url + "]";
	}

	public Skill(long id, String name, String version, String description, String image_url) {
		super();
		this.id = id;
		this.name = name;
		this.version = version;
		this.description = description;
		this.image_url = image_url;
	}

	public Skill() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int hashCode() {
		return Objects.hash(description, id, image_url, name, user_skill, version);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Skill other = (Skill) obj;
		return Objects.equals(description, other.description) && id == other.id
				&& Objects.equals(image_url, other.image_url) && Objects.equals(name, other.name)
				&& Objects.equals(user_skill, other.user_skill) && Objects.equals(version, other.version);
	}
	
	
}
