package com.demo.projeto.spring.service;

import java.util.List;

import com.demo.projeto.spring.models.Funcionario;

public interface FuncionarioService {

	
    void salvar(Funcionario funcionario);
	
	void editar(Funcionario funcionario);
	
	void excluir(Long id);
	
	Funcionario buscarPorId(Long id);
	
	List<Funcionario> buscarTodos();
}
