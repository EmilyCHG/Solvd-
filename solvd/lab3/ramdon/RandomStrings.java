
package com.solvd.lab3.ramdon;

import java.util.Random;

public class RandomStrings {
	
	public static String [] generatedRandomNames(int cant) {
		String [] ranNames =  new String [cant];
		
		String [] names = {"emily", "ariana", "gaby", "katy","francis" };

		
		
	for (int i = 0; i < cant; i++) {
		ranNames[i]= names[(int) Math.floor(Math.random()*((names.length - 1) - 0 + 1))];
	
		} return ranNames;
	
	}
	
	public static void print(String [] genNames) {
		for (int i=0; i<genNames.length;i++) {
			//System.out.println(genNames[i].toUpperCase());
			System.out.println("--------------------------------");
			//System.out.println(genNames[i].replace('a','A'));
			System.out.println("--------------------------------");
			System.out.println(genNames[i].replaceFirst("emily", "dafne"));
			//System.out.println(genNames[i].replace("francis", "gretel"));
		
		}
		
		
	}
	

	public static void main(String[] args) {
		
		print (generatedRandomNames(10));
		

		System.out.println("--------------------------------");
		
		
		//random names
		String names [] = {"emily", "ariana", "gaby", "katy","francis", };
		System.out.println( names[new Random().nextInt(names.length)]);
	
		System.out.println("--------------------------------");
	
		String characters = "abcdefghijklmnopqrstuvwxyz";
		characters = characters.replaceAll(characters, "frbfhebwfhrbe");
		//characters = characters.replace('j','J');
		System.out.println(characters);
		
		String randomString ="";
		int length = 6;
		
		//random letter with a length
		Random ran = new Random();
		
		char[] text =  new char [length];
		
		for (int i = 0; i <length; i++) {
			text [i] =  characters.charAt(ran.nextInt(characters.length()));
		}
		
		for (int i = 0; i< text.length; i++) {
			randomString += text [i];
		}
		 System.out.println(randomString.toUpperCase());
		
		 //random letter one by one
		 System.out.println("--------------------------------");
		
		  
		 Random nun = new Random();
		 byte posletter= (byte) nun.nextInt(characters.length()-1);
		 
		 System.out.println(characters.charAt(posletter));
		 
		 System.out.println("--------------------------------");
		 
 		}
	
	
}
	