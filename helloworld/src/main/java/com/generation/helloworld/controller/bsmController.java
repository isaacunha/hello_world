package com.generation.helloworld.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bsm")
public class bsmController {
	
	@GetMapping
	public String ListaBsm() {
		return "Persistencia/lnMentalidade de Crescimento/n Orientação ao futuro/nResponsabilidade pessoal/nTrabalho em Equipe/nAtenção aos detalhes/nProatividade/nComunicação";
	}

}
