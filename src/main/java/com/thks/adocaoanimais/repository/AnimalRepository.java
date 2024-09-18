package com.thks.adocaoanimais.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.thks.adocaoanimais.model.Animal;

public interface AnimalRepository extends CrudRepository<Animal, Long> {
	
	public List<Animal> findByApelidoIgnoreCaseContaining(String apelido);

}
