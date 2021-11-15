
package com.solvd.lab3;

public class StaticPetshop {

	public final static String NAME_SHOP = "little PET";
	public final static int HOUR =8;
	public final static int HOUR2= 18;


	public static void open() {
		
	System.out.println("the " + NAME_SHOP + " opens at " + HOUR + " am" );
	}

	public static void close () {
	System.out.println("the " + NAME_SHOP + " closes at " + HOUR2 + " pm" );
	}

}