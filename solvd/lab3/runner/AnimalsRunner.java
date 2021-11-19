
package com.solvd.lab3.runner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
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
		
		List <Set <EarthAnimal>> earthAnimal = new ArrayList <Set <EarthAnimal>>();
		
		Set <EarthAnimal> mov1 = new HashSet<EarthAnimal>();
		Set <EarthAnimal> mov2 = new HashSet<EarthAnimal>();

		
		mov1.add(earthAnimal1);
		mov2.add(earthAnimal2);
		
		earthAnimal.add(0,mov1);
		earthAnimal.add(1,mov2);
		earthAnimal.add(2,mov1);
		
		System.out.println(earthAnimal);
	
		
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
		System.out.println("Contains: " + identification2.contains(earthAnimal1));
		System.out.println("Remove: " + identification2.remove(airAnimal1));
		
		
		for(Animal element : identification2 ) {
			System.out.println(element);
		}
		
		
		System.out.println();
		System.out.println("------------Implementation TreeSet List--------------------");
		System.out.println();

	    
		Set<String> nameAnimal = new TreeSet<>();
		
		nameAnimal.add("Lyon");
		nameAnimal.add("Lyon");
		nameAnimal.add("Monkey");
		nameAnimal.add("Eagle");
		nameAnimal.add("Duck");
		nameAnimal.add("Cat");
		nameAnimal.add("Dog");
		nameAnimal.add("Elephant");
		nameAnimal.add("Giraffe");
		nameAnimal.add("Mouse");
		
		System.out.println("Size: " + nameAnimal.size());
		System.out.println("Contains; " + nameAnimal.contains("Monkey"));
		System.out.println("Remove: " + nameAnimal.remove("Dog"));
		
		for(String element : nameAnimal ) {
			System.out.println(element);
		}
	
		
		System.out.println();
		System.out.println("------------Implementation LinkedList List--------------------");
		System.out.println();

		
		LinkedList<String> movement = new LinkedList<>();
		
		movement.add("quadruped");
		movement.add("biped");
		movement.add("flying");
		movement.add("palmipeds");
		movement.add("trail");
		movement.add("swimming");
		
		System.out.println(movement.getFirst());
		System.out.println(movement.getLast());
		System.out.println(movement.removeLast());
		System.out.println(movement);
		
		System.out.println(movement.get(4));
		
	
		System.out.println();
		System.out.println("------------Implemention  Queue List--------------------");
		System.out.println();
		
		
		Queue<String> nameAnimal2 = new LinkedList<>();
	
		nameAnimal2.add("Lyon");
		nameAnimal2.add("Lyon");
		nameAnimal2.add("Monkey");
		nameAnimal2.add("Eagle");
		nameAnimal2.add("Duck");
		nameAnimal2.add("Cat");
		nameAnimal2.add("Dog");
		nameAnimal2.add("Elephant");
		nameAnimal2.add("Giraffe");
		nameAnimal2.add("Mouse");
		 
	   
		//for(String element : nameAnimal2 ) {
			//System.out.println(element);
		//}
		
		//nameAnimal2.poll();
		System.out.println(nameAnimal2.poll());
		System.out.println(nameAnimal2);
		
		System.out.println(nameAnimal2.toArray()[5]);
		
		System.out.println(nameAnimal2.poll()); //Subtract
		System.out.println(nameAnimal2);
		
		
		//nameAnimal2.poll();
		
		System.out.println(nameAnimal2.peek()); //add
		System.out.println(nameAnimal2);
		
		System.out.println(nameAnimal2.toArray()[5]);
		
		System.out.println();
		System.out.println("------------Implementation Maps and HashMap List--------------------");
		System.out.println();
		
		Map<String, EarthAnimal> list = new HashMap <String, EarthAnimal>();
		
		list.put("First Animal ", earthAnimal2);
		list.put("Second Animal ", earthAnimal1);
		
		//list.replace("First Animal ", earthAnimal2);
		//list.get("First Animal");
		//list.remove("Second Animal");
		
		
		for (Entry<String, EarthAnimal> e : list.entrySet()) {
		System.out.println(e.getKey() + " - " + e.getValue());

		}
		
		System.out.println();
		System.out.println("------------Implementation Generics --------------------");
		System.out.println();
	
		GenericClass <String> listGe = new GenericClass <String>();
	
		listGe.push("Lyon");
		listGe.push("Monkey");
		listGe.push("Rabbit");
		listGe.push("Cow");
		listGe.push("Fish");
		
		System.out.println(listGe.pop());
		System.out.println(listGe.pop());	
		System.out.println(listGe.pop());
		
		System.out.println(listGe.peek());
	
	
	
	
	
	}
	
}
