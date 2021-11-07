
package com.solvd.lab3.runner;

import com.solvd.lab3.*; 

public class AnimalsRunner {

	
	
	public static void main(String[] args) {
	
		
		
		EarthAnimals earthAnimals1 = new EarthAnimals();
		earthAnimals1.setName("Lyon");
		earthAnimals1.setWeigth(190);
		earthAnimals1.setGender("Felidae");
		earthAnimals1.setSkin("short coat");
		earthAnimals1.setMovement("quadrupeds");
		earthAnimals1.setType("mammal");
		
		System.out.println(earthAnimals1.toString());
		System.out.println(" Are: " + earthAnimals1.getMovement() + ", and " + earthAnimals1.getType() );
		earthAnimals1.movement();
		earthAnimals1.typeOfAnimal();
		
		System.out.println("--------------------------------");
		
		EarthAnimals earthAnimals2 = new EarthAnimals();
		earthAnimals2.setName("Monkey");
		earthAnimals2.setWeigth(50);
		earthAnimals2.setGender("primate");
		earthAnimals2.setType("mammal");
		earthAnimals2.setSkin("short coat");
		earthAnimals2.setMovement("quadrupeds");
		
		System.out.println(earthAnimals2.toString());
		System.out.println(" Are: " + earthAnimals2.getMovement() + ", and " + earthAnimals2.getType() );
		earthAnimals2.movement();
		earthAnimals2.typeOfAnimal();
		
		System.out.println("--------------------------------");
		
		
		if (earthAnimals1.equals(earthAnimals2)) {
			System.out.println("they are the same type of animals");
			
		}else {
			System.out.println("they are not the same type of animals");
			System.out.println(earthAnimals1.hashCode());
			System.out.println(earthAnimals2.hashCode());
		}
	
		System.out.println("--------------------------------");
		
		
		AirAnimals airAnimals1 = new AirAnimals();
		airAnimals1.setName("Eagle");
		airAnimals1.setWeigth(6);
		airAnimals1.setGender("Accipitridae");
		airAnimals1.setSkin("pens");
		airAnimals1.setMovement("flying");
		airAnimals1.setType("oviparous");
		airAnimals1.setSpeed(50);
		
		System.out.println(airAnimals1.toString());
		airAnimals1.movement(50);
		airAnimals1.typeOfAnimal();
		airAnimals1.typeOfAnimal("Eagle","oviparous");
		
		System.out.println("--------------------------------");
		
		
		AirAnimals airAnimals2 = new AirAnimals();
		airAnimals2.setName("Eagle");
		airAnimals2.setWeigth(8);
		airAnimals2.setGender("Accipitridae");
		airAnimals2.setSkin("pens");
		airAnimals2.setMovement("flying");
		airAnimals2.setType("oviparous");
		airAnimals2.setSpeed(65);
		System.out.println(airAnimals2.toString());
		airAnimals1.movement(65);
	
		System.out.println("--------------------------------");
		
		if (airAnimals1.equals(airAnimals2)) {
			System.out.println("they are the same type of animals");
			System.out.println(airAnimals1.hashCode());
			System.out.println(airAnimals2.hashCode());
		}else {
			System.out.println("they are not the same type of animals");
			System.out.println(earthAnimals1.hashCode());
			System.out.println(earthAnimals2.hashCode());
		}
		
		}

	
	
	}
