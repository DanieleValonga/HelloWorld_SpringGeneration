package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {
	
	@GetMapping
	public String helloWorld() {
		return "Hello World!!!";
	}
	
	@GetMapping("/bsn")
	public String BsmGeneration() {
		return "Orientação ao Futuro"+
				"Responsabilidade Pessoal"+
				"Mentalidade de Crescimento"+
				"Comunicação"+
				"Gerenciamento de Tempo"+
				"Ética"+
				"Trabalho em Equipe"+
				"Pensamento Crítico"+
				"Autoconfiança"+
				"Orientação para Resultados"+
				"Adaptabilidade"+
				"Resolução de Problemas";
	}
	
	@GetMapping("/objetivoSemana")
	public String objetivoSemana() {
		return "Para essa semana, meus objetivos são aprimorar minhas habilidades de:"+
				"Mentalidade de crescimento, "+
				"meu gerenciamento de tempo, e"+
				"também meus conhecimentos técnicos.";
	}

}
