package com.algaworks.algalog.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.algalog.domain.model.Cliente;

@RestController
public class ClienteController {
	
	@GetMapping("/clientes")
	public List<Cliente> teste(){
		Cliente cliente1 = new Cliente(1L, "Pedro", "pedrofavarao@gmail.com", "(16)99322-3662");
		Cliente cliente2 = new Cliente(2L, "João", "joao.favarao@gmail.com", "(16)99322-3662");
		return Arrays.asList(cliente1, cliente2);
	}
}
