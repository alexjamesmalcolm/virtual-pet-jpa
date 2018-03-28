package com.alexjamesmalcolm.virtualpetjpa.pet;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public abstract class Pet {

	static final int DEFAULT_HEALTH = 100;
	static final int DEFAULT_BOREDOM = 20;
	static final int BOREDOM_PER_TICK = 5;
	@Id
	@GeneratedValue
	private Long id;
	String name;
	String description;
	int health;
	int boredom;

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public int getHealth() {
		return health;
	}

	public int getBoredom() {
		return boredom;
	}

	public abstract void tick();

	public void play() {
		boredom = 0;
	}

	public boolean isAlive() {
		return health > 0;
	}
}