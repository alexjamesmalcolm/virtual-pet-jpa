package com.alexjamesmalcolm.virtualpetjpa;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class PetPopulator implements CommandLineRunner {
	
	private Logger log = LoggerFactory.getLogger(PetPopulator.class);

	@Resource
	private PetRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		repository.save(new OrganicDog("Phil", "That's a cool dog"));
	}

}
