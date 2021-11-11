
package com.solvd.lab3.runner;

import com.solvd.lab3.*; 

public class AnimalsRunner {

	
	
	public static void main(String[] args) {
	
		
		
		Animal earthAnimal1 = new EarthAnimal();
		earthAnimal1.identification(" lyon " , " mammal ");
		earthAnimal1.movement();
		earthAnimal1.typeOfAnimal(190, "quadrupeds");
		((EarthAnimal) earthAnimal1).description("short coat","felidae");
		System.out.println("--------------------------------");
		
		EarthAnimal earthAnimal2 = new EarthAnimal();
		earthAnimal2.setName("monkey");
		earthAnimal2.setWeigth(50);
		earthAnimal2.setType("mammal");
		earthAnimal2.setMovement("quadrupeds");
		
		System.out.println(earthAnimal2.toString());
		System.out.println(" Are: " + earthAnimal2.getMovement() + ", and " + earthAnimal2.getType() );
		earthAnimal2.movement();
		earthAnimal2.typeOfAnimal(50,"quadrupeds ");
		
		System.out.println("--------------------------------");
		
		
		if (earthAnimal1.equals(earthAnimal2)) {
			System.out.println("they are the same type of animals");
			
		}else {
			System.out.println("they are not the same type of animals");
			System.out.println(earthAnimal1.hashCode());
			System.out.println(earthAnimal2.hashCode());
		}
	
		System.out.println("--------------------------------");
		
		
		AirAnimal airAnimal1 = new AirAnimal();
		airAnimal1.identification("eagle","oviparous");
		airAnimal1.typeOfAnimal(8,"flying");
		airAnimal1.setMovement("flyign");
		airAnimal1.movement(50);
		airAnimal1.description("pens","Accitripidae");
		
		
		System.out.println("--------------------------------");
		
		
		AirAnimal airAnimal2 = new AirAnimal();
		airAnimal2.identification("duck","oviparous");
		airAnimal2.typeOfAnimal(3,"palmipeds");
		airAnimal2.description("pens","Anatidae");
	
		System.out.println("--------------------------------");
		
		
		if (airAnimal1.equals(airAnimal2)) {
			System.out.println("they are the same type of animals");
			
		}else {
			System.out.println("they are not the same type of animals");
			
		}
		
		//interfaces
		System.out.println("--------------------------------");
		
		airAnimal2.home("duck","lakes");
		earthAnimal1.time("lyon",20);
		airAnimal1.sleep("eagle");
		earthAnimal2.animalsound("monkey","juju");
		airAnimal1.animaleat("eagle","animals");
		
		System.out.println("--------------------------------");
		
		//FINAL class
		//FINAL METHODS
		
		final DomesticAnimal  domAni = new DomesticAnimal();
		domAni.play("dog");
		domAni.live(20);
		
		System.out.println("--------------------------------");
		
		//static Block
		
		StaticPetshop.open();
		StaticPetshop.close();
		
		
	
	}


	}
