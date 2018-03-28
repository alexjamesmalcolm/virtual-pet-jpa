package com.alexjamesmalcolm.virtualpetjpa;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.alexjamesmalcolm.virtualpetjpa.pet.OrganicDog;

@Component
public class PetPopulator implements CommandLineRunner {
	
	@SuppressWarnings("unused")
	private Logger log = LoggerFactory.getLogger(PetPopulator.class);

	@Resource
	private PetRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		repository.save(new OrganicDog("Phil", "That's a cool dog"));
	}

}
