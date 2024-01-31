package org.generation.italy.testspring.controller;

import org.generation.italy.testspring.repository.ContenutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Contenuti")

public class ContenutiController {

	@Autowired			
	ContenutoRepository contenutoRepository;
	
	@GetMapping
	public String index() {
		return "/Contenuto/NotFound";
	}
}
