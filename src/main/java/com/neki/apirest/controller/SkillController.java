package com.neki.apirest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neki.apirest.dto.SkillExibir;
import com.neki.apirest.dto.SkillInserir;
import com.neki.apirest.entity.Skill;
import com.neki.apirest.repository.SkillRepository;
import com.neki.apirest.service.SkillService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;



@RestController
@RequestMapping(value="/api")
@Api(value="Neki API REST")
public class SkillController {
	
	@Autowired
	SkillRepository skillRepository;
	
	@Autowired
	SkillService skillService;
	
	@GetMapping("/skill")
	@ApiOperation(value = "Retorna lista de skills")
	public ResponseEntity<List<Skill>> listaSkill(){
		List<Skill> user = skillService.findAll();
		return ResponseEntity.ok(user);
	}
	
	@PostMapping("/skill")
	@ApiOperation(value="Metodo para criar um criar")
	public SkillExibir create(@RequestBody SkillInserir skillInserir) {
			SkillExibir skillExibir = skillService.criarSkill(skillInserir);
		return skillExibir;
		
	}

	@DeleteMapping("/skill/{id}")
	@ApiOperation(value="Deletar Skill")
	public ResponseEntity<Void> delete(@PathVariable Long id){
		if (!skillService.deleteSkill(id)) {
			return ResponseEntity.notFound().build();
		}return ResponseEntity.noContent().build();
				
	}
	
	@PutMapping("/skill/{id}")
	@ApiOperation(value="Atualizar Skill")
	public ResponseEntity<SkillExibir> atualizar(@PathVariable Long id, @RequestBody SkillInserir skillInserir){
		SkillExibir skillExibir = skillService.atualizarSkill(id, skillInserir);
		if (skillExibir != null) {
			return ResponseEntity.ok(skillExibir);
		}
		else { return ResponseEntity.notFound().build();
		
		}
	}
}
