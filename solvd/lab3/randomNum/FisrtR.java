
package com.solvd.lab3.randomNum;

import java.util.Random;

public class FisrtR {
	
	public static void main (String [] args) {
		
		System.out.println("--------------------------------");
		
		Random r = new Random();
		double ran = r.nextDouble();
		double num = ran * 10000;
		int  ourNumber = (int) num ;
		
		System.out.println(ourNumber);
		
		System.out.println("--------------------------------");
		
		//0 to 24
		int n1 = r.nextInt(25);
		System.out.println("Generated number is: " + n1);
		
		int n2 = r.nextInt(31) + 5;
		System.out.println("Generated number is: " + n2);
		
		System.out.println("--------------------------------");
		
		//1000 - 9999
		int n3 = 1000 + r.nextInt(10000 - 1000);
		System.out.println("Generated number is: " + n3);
		
		
		System.out.println("--------------------------------");
		//using a function 
		int n4 = rndRange(1,20);
		
		 System.out.println("Generated number is: " + n4);
		
		
		//using a overloading function 
		int n5 = rndRange(10);
		
		System.out.println("Generated number is: " + n5);
		
		
		}
		
	
		
		public static int rndRange(int start,int finish) {
			
		Random r = new Random();
			int  rInt = r.nextInt(finish + 1 - start) + start;
			return rInt;
		}
		
		public static int rndRange(int finish) {
			
			return rndRange(1,finish);
		}
			
 		
		
		
	
	

}



