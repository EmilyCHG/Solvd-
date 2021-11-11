
package com.solvd.lab3;

public class StaticPetshop {

	static String shop = "little PET";
	static int hour = 8;
	static int hour2= 18;


	public static void open() {
	System.out.println("the " + shop + " opens at " + 8 + " am" );
	}

	public static void close () {
	System.out.println("the " + shop + " closes at " + 18 + " pm" );
	}

}