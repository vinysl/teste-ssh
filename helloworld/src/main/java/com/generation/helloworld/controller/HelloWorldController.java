package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Indica que essa classe é uma controladora
@RequestMapping("/hello-world") // Indica os endpoints da classe
public class HelloWorldController {

	@GetMapping
	public String helloWorld() {
		return "Hello World!!!";
	}
	
	@GetMapping("/bsms")
	public String bsms() {
		return "Persistência, Mentalidade de Crescimento, Responsabilidade Pessoal,"
				+ "Orientação ao Futuro, Proatividade, Comunicação, Trabalho em Equipe e"
				+ "Orientação ao Detalhe.";
	}
	
	@GetMapping("/lista-objetivos")
	public String listaObjetivos() {
		return "Essa semana aprendi sobre banco de dados, estou começando a aprender agora sobre"
				+ "Spring Boot, uma BSM que estou trabalhando nesta semana é a proatividade.";
	}
}
