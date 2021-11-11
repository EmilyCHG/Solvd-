
package com.solvd.lab3;

public final class DomesticAnimal {

	String name = "dog";
	final int YEAR = 14;
	
	public final void play (String name) {
		System.out.println( name + " plays with the ball");
		
	}	
	
	public final void live (int num) {
			System.out.println("lives with his owner since " + YEAR + " years");
			
	}

	public final String getName() {
		return name;
	}

	public final int getYEAR() {
		return YEAR;
	}
	
	

}


