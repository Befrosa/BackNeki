package com.neki.apirest.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.neki.apirest.dto.SkillExibir;
import com.neki.apirest.dto.SkillInserir;
import com.neki.apirest.dto.UserExibir;
import com.neki.apirest.dto.UserInserir;
import com.neki.apirest.entity.Skill;
import com.neki.apirest.entity.UserModel;
import com.neki.apirest.repository.SkillRepository;

@Service
public class SkillService {

	@Autowired
	private SkillRepository skillRepository;
	
	public List<Skill> findAll(){
		return skillRepository.findAll();
	}
	
	public List<SkillExibir> listarTodos(){
		List<SkillExibir> skillExibirDto = new ArrayList<SkillExibir>();
		List<Skill> skills = skillRepository.findAll();
		for(Skill skill:skills) {
			SkillExibir Dto = new SkillExibir(skill);
			skillExibirDto.add(Dto);
		}
		return skillExibirDto;
	}
	
	public SkillExibir criarSkill(SkillInserir skillInserir) {
		Skill skill = new Skill();
		skill.setName(skillInserir.getName());
		skill.setVersion(skillInserir.getVersion());
		skill.setDescription(skillInserir.getDescription());
		skill.setImage_url(skillInserir.getImage_url());
		skill = skillRepository.save(skill);
		return new SkillExibir(skill);
	}
	
	public boolean deleteSkill(Long id) {
		if (!skillRepository.existsById(id)) {
		return false;	
		}
		skillRepository.deleteById(id);
		return true;
	}
	
	public SkillExibir atualizarSkill(Long id, SkillInserir skillInserir) {
		Skill skill = new Skill();
		if(!skillRepository.existsById(id)) {
			return null;
		}
		skill.setId(id);
		skill.setName(skillInserir.getName());
		skill.setVersion(skillInserir.getVersion());
		skill.setDescription(skillInserir.getDescription());
		skill.setImage_url(skillInserir.getImage_url());
		skill = skillRepository.save(skill);
		return new SkillExibir(skill);
	}
	
}
