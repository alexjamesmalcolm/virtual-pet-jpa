package com.alexjamesmalcolm.virtualpetjpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Cage extends Box {
	
	@Id
	@GeneratedValue
	Long id;
	@OneToOne
	Pet pet;

	public Cage(int dirtyness) {
		this.dirtyness = dirtyness;
	}

	public Cage() {
		this(DEFAULT_DIRTYNESS);
	}

}
