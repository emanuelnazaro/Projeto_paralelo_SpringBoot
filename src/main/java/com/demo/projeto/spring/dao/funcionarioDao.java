package com.demo.projeto.spring.dao;

import java.util.List;

import com.demo.projeto.spring.models.Funcionario;


public interface funcionarioDao {

	
void save(Funcionario funcionario);
	
	void update(Funcionario funcionario);
	
	void delete(Long id);
	
	Funcionario findById(Long id);
	
	List<Funcionario> findAll();
}
