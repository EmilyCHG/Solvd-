
package com.solvd.lab3.runner;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.solvd.lab3.*; 

public class AnimalsRunner {

	private static final Logger LOG = Logger.getLogger(AnimalsRunner.class.getName());
	
	
	public static void main(String[] args) {
	
		System.out.println("------------Earth Animal 1----------------");
		System.out.println();
		
		EarthAnimal earthAnimal1 = new EarthAnimal();
		earthAnimal1.setName("Lyon");
		earthAnimal1.setWeigth(50);
		earthAnimal1.setType("mammal");
		earthAnimal1.setMovement("quadrupeds");
		
		try {
			earthAnimal1.identification("lyon" , "lyon");
		} catch (EqualsException e) {
			System.out.println(e );
			LOG.log(Level.INFO, "You have to change the animal name, it not can be the same! " );
		}
		System.out.println();
		
	    try {
			earthAnimal1.typeOfAnimal(-190, "quadrupeds");
		} catch (WrongNumberException e) {
			System.out.println( e);
			LOG.log(Level.WARNING, "It is not a possible weight "); 
		}
		System.out.println();
		
		try {
			earthAnimal1.time("ly",-20);
		} catch (WrongNumberException e) {
			System.out.println(e.getMessage());
			LOG.log(Level.FINER," Invalided dates. ");
		}
		System.out.println();
		
		earthAnimal1.movement();	
		earthAnimal1.description("short coat","felidae");
		
		System.out.println();
		System.out.println("---------Earth Animal 2-----------------------");
		System.out.println();
		
		EarthAnimal earthAnimal2 = new EarthAnimal();
		earthAnimal2.setName("monkey");
		earthAnimal2.setWeigth(50);
		earthAnimal2.setType("mammal");
		earthAnimal2.setMovement("quadrupeds");
		System.out.println();
		
		System.out.println(earthAnimal2.toString());
		System.out.println(" Are: " + earthAnimal2.getMovement() + ", and " + earthAnimal2.getType() );
		earthAnimal2.movement();
		System.out.println();
		
		try {
			earthAnimal2.typeOfAnimal(50,"quadrupeds ");
		} catch (WrongNumberException e) {
			System.out.println(e);
			LOG.log(Level.FINER, "It is not a possible weight");
		}	
		System.out.println();
		
		
		try {
			earthAnimal2.animalSound("monkey","juju");
		} catch (EqualsException e4) {
			// TODO Auto-generated catch block
			e4.printStackTrace();
		}
		System.out.println();
		
		try {
			earthAnimal2.time("Monkey",4);
		} catch (WrongNumberException e) {
			System.out.println(" Invalided dates. " + e.getMessage());
			LOG.log(Level.FINER,"It is not a possible weight");
		}
		
		System.out.println();	
		System.out.println("--------------------------------");
		System.out.println();
		
		/*
		if (earthAnimal1.equals(earthAnimal2)) {
			System.out.println("they are the same type of animals");
			
		}else {
			System.out.println("they are not the same type of animals");
			System.out.println(earthAnimal1.hashCode());
			System.out.println(earthAnimal2.hashCode());
		}
		 */
		
		System.out.println();
		System.out.println("---------------Air Animal1-----------------");
		System.out.println();
		
		AirAnimal airAnimal1 = new AirAnimal();
		airAnimal1.setName("Eagle");
		airAnimal1.setWeigth(6);
		airAnimal1.setType("oviparous");
		airAnimal1.setMovement("Flying");
		
		System.out.println();
		try {
			airAnimal1.identification("oviparous","oviparous");
		} catch (EqualsException e) {
			System.out.println(e);
		LOG.log(Level.SEVERE, "the name of type is the same, you have to change it " );
		}
		
		System.out.println();
		try {
			airAnimal1.typeOfAnimal(8,"flying");
		} catch (WrongNumberException e) {
			
			e.printStackTrace();
		}
		
		System.out.println();
		airAnimal1.setMovement("flyign");
		airAnimal1.movement(50);
		airAnimal1.description("pens","Accitripidae");
		airAnimal1.animalSleep("eagle");
		
		try {
			airAnimal1.identification("eagle","oviparous");
		} catch (EqualsException e) {
			System.out.println("You have to change your input" + e);
		}
		
		System.out.println();
		try {
			airAnimal1.eat("","animals");
		} catch (EmptyVarException e) {
			System.out.println(e);
			LOG.log(Level.WARNING, "You can not use a empty element");
		}
		
		System.out.println();
		System.out.println("-----------Air Animal 2---------------------");
		System.out.println();
		
		AirAnimal airAnimal2 = new AirAnimal();
		airAnimal2.setName("duck");
		airAnimal2.setWeigth(3);
		airAnimal2.setType("oviparous");
		airAnimal2.setMovement("palmipeds");
	
		try {
			airAnimal2.identification("duck","oviparous");
		} catch (EqualsException e1) {
			System.out.println("you have to change your input");
		}
		
		System.out.println();
		try {
			airAnimal2.typeOfAnimal(568525,"palmipeds");
		} catch (WrongNumberException e) {
			System.out.println(e);
			LOG.log(Level.FINEST, "It is not a possible weight");
		}
		
		System.out.println();
		airAnimal2.description("pens","Anatidae");
		System.out.println();
		
		try {
			airAnimal2.home("duck","la");
		} catch (WrongLengthException e) {
			System.out.println(e.getMessage());
			LOG.log(Level.ALL, "the length is wrong");
		}
		
		System.out.println();	
		System.out.println("--------------------------------");
		System.out.println();
		
		/*
		if (airAnimal1.equals(airAnimal2)) {
				System.out.println("they are the same type of animals");
				
		}else {
				System.out.println("they are not the same type of animals");
				
		}*/
	
		System.out.println();
		System.out.println("---------------Final Methods-----------------");
		System.out.println();
				
		final DomesticAnimal  domAni = new DomesticAnimal();
			  domAni.play();
			  domAni.live(20);
	
			  
		System.out.println();
		System.out.println("----------Static Block----------------------");
		System.out.println();
		
		StaticPetshop.open();
		StaticPetshop.close();
		
		System.out.println();
		System.out.println("------------Implementation Lists--------------------");
		System.out.println();

		
		/*Set <Animal> identification = new HashSet<> () ;
		identification.add(earthAnimal1);
		identification.add(earthAnimal2);
		identification.add(airAnimal2);
		identification.add(airAnimal1);
		
		
		System.out.println("Size: " + identification.size());
		System.out.println("Is Empty: " + identification.isEmpty());
		System.out.println("Contains; " + identification.contains(earthAnimal1));
		
		for (Animal element : identification) {
			System.out.println(element);
		}
        */
		
		System.out.println();
		System.out.println("------------Implemention  Set List--------------------");
		System.out.println();


		Set<Animal> identification2 = new LinkedHashSet<Animal>() ;
		identification2.add(earthAnimal1);
		identification2.add(earthAnimal2);
		identification2.add(earthAnimal2);
		identification2.add(airAnimal2);
		identification2.add(airAnimal1);
		identification2.add(airAnimal1);
		
		System.out.println("Size: " + identification2.size());
		System.out.println("Is Empty: " + identification2.isEmpty());
		System.out.println("Contains; " + identification2.contains(earthAnimal1));
		System.out.println("Remove: " + identification2.remove(airAnimal1));
		
		for (Animal element : identification2) {
			System.out.println(element);
		}
		
		
	    
		
		System.out.println();
		System.out.println("------------Implementation TreeSet List--------------------");
		System.out.println();

	    
		Set<String> NameAnimal = new TreeSet<>();
		
		NameAnimal.add("Lyon");
		NameAnimal.add("Monkey");
		NameAnimal.add("Eagle");
		NameAnimal.add("Duck");
		NameAnimal.add("Cat");
		NameAnimal.add("Dog");
		NameAnimal.add("Elephant");
		NameAnimal.add("Giraffe");
		NameAnimal.add("Mouse");
		
		System.out.println("Size: " + NameAnimal.size());
		System.out.println("Contains; " + NameAnimal.contains("Monkey"));
		System.out.println("Remove: " + NameAnimal.remove("Dog"));
		
		for(String element : NameAnimal ) {
			System.out.println(element);
		}
	
	
	
		
		
			
	
		 
		 
	   
	

		
		}
	
}
