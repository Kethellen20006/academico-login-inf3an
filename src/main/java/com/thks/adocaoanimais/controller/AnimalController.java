package com.thks.adocaoanimais.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thks.adocaoanimais.model.Animal;
import com.thks.adocaoanimais.repository.AnimalRepository;

@RestController
@RequestMapping("/animais")
public class AnimalController {
	
	@Autowired
	private AnimalRepository repository;
	
	@GetMapping("/")
	public Iterable<Animal> listAll() {
		return repository.findAll();
	}

}
