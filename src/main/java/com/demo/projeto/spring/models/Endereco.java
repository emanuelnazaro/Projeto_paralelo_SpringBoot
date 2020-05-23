package com.demo.projeto.spring.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@SuppressWarnings("serial")
@Entity
@Table(name = "ENDERECOS")
@Getter
@Setter
public class Endereco extends AbstractEntity<Long> {

	@Column(nullable = false)
	private String Logradouro;
	
	@Column(nullable = false)
	private String bairro;
	
	@Column(nullable = false)
	private String cidade;
	
	@Column(nullable = false, length = 2)
	@Enumerated(EnumType.STRING)
	private UF uf;
	
	@Column(nullable = false,length = 9)
	private String cep;
	
	@Column(nullable = false,length = 5)
	private Integer numero;
}
