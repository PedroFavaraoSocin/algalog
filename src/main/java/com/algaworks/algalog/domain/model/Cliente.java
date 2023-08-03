package com.algaworks.algalog.domain.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cliente {
	private Long id;
	private String nome;
	private String email;
	private String telefone;
	
	public Cliente() {
		// TODO Auto-generated constructor stub
	}
	
	public Cliente(Long id, String nome, String email, String telefone) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
	}
}