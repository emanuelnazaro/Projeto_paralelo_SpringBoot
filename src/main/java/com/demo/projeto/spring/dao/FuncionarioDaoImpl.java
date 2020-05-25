package com.demo.projeto.spring.dao;

import org.springframework.stereotype.Repository;

import com.demo.projeto.spring.models.Funcionario;

@Repository
public class FuncionarioDaoImpl extends AbstractDao<Funcionario, Long> implements funcionarioDao{

}
