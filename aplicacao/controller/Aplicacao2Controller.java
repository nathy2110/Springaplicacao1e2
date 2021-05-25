package com.aplicacao2.aplicacao.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aplicacao")
public class Aplicacao2Controller {
	
	@GetMapping
	public String hello() {
		return "Aprender SpringBoot e me desenvolver melhor como Dev ";
	}
		

}
