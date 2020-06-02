package com.demo.projeto.spring.service;

import java.util.List;

import com.demo.projeto.spring.models.Departamento;


public interface DepartamentoService {

    void salvar(Departamento departamento);
	
	void editar(Departamento departamento);
	
	void excluir(Long id);
	
	Departamento buscarPorId(Long id);
	
	List<Departamento> buscarTodos();
}
