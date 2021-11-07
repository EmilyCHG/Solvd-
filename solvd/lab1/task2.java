
package com.solvd.lab1;

import java.util.Arrays;

public class task2 {
	
	public static void main (String[]args) {
		int [] array= {3, 7, 6, 13, 33, 9, -100, 25};
		
		
		int mayor;
		int menor;
		mayor= menor= array[0];
		int n=0;
		
		while( n < array.length)
		
		{
			if(array [n] > mayor) {
				mayor= array[n];
			}
			if(array[n]<menor) {
				menor=array[n];
			}
			n++;
			
		}
		System.out.println(Arrays.toString(array));
		System.out.println("el mayor valor del array es :"+mayor);
		System.out.println("el menor valor del array es :"+menor);
	} 

}
