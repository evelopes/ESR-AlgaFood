package com.algaworks.algafood;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.algaworks.algafood.di.modelo.Cliente;
import com.algaworks.algafood.di.service.AtivacaoClienteService;

import ch.qos.logback.core.net.server.Client;

@Controller
public class MeuPrimeiroController {
	
	private AtivacaoClienteService ativacaoClienteService;

	
	
	public MeuPrimeiroController(AtivacaoClienteService ativacaoClienteService) {
		super();
		this.ativacaoClienteService = ativacaoClienteService;
	}



	@GetMapping("/hello")
	@ResponseBody
	public String hello() {
		Cliente Joao = new Cliente("João", "joao@joao.com", "912034560");
		
		ativacaoClienteService.ativar(Joao);
		
		return "Hello!!";
	}
	}
