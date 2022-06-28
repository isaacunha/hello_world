package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetivos-aprendizagem")
public class objetivosAprendizagemController {
	
	@GetMapping
	public String ObjetivosAprendizagem() {
		return "Objetivo dessa semana é aprender spring";
	}

}
