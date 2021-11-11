package com.solvd.lab3;

import java.util.Objects;

public class Animal implements AnimalSound, AnimalEat, AnimalSleep, AnimalHome, TimeOfLife {
	
	protected String name;
	protected int weigth; 
	protected String type;
	protected String movement;

	public Animal() {
		super (); 
	}
	
	public Animal(String name, int weigth, String type, String movement) {
		super();
		this.name=name;
		this.type=type;
		this.weigth=weigth;
		this.movement=movement;
		
	}
	
	public void time(String name, int num) {
	
	}
	
	public void home() {
		
	}

	public void sleep() {
		System.out.println( name + " is zzz... ");
	}
	
	public void animaleat() {	
	}
	
	public void animalsound() {	
	}
	
	public void identification(String name, String type) {
		System.out.println("its a :" + name + "and are :" + type);
		
	}
	
	public void typeOfAnimal(int weight, String movement) {
		System.out.println( " Weight "+ weight+" kg," + " and are : " + movement);
		
	}

	public void movement() {
		System.out.println(" It's " + movement);
		
	}
	
	@Override
	public String toString() {
		return "Animal [name=" + name + ", weigth=" + weigth + ", type=" + type + ", movement=" + movement + "]";
	}

	public void setName(String name) {
		this.name = name;
	}


	public int getWeigth() {
		return weigth;
	}


	public void setWeigth(int weigth) {
		this.weigth = weigth;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}

	public String getMovement() {
		return movement;
	}

	public void setMovement(String movement) {
		this.movement = movement;
	}

	@Override
	public int hashCode() {
		return Objects.hash(movement, name, type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		return Objects.equals(movement, other.movement) && Objects.equals(name, other.name)
				&& Objects.equals(type, other.type);
	}

	@Override
	public void time() {
		
		
	}



	

	

	
	

	
	
	
	
}

