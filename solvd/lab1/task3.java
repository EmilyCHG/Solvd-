
package com.solvd.lab1;

import java.util.Arrays;

public class task3 {
	
public static void main(String[] args) {
		
		int[] arr= {3, 7, 6, 13, 33, 9, -100, 25};
		
		inSort(arr);
		
		System.out.println(Arrays.toString(arr));
		 
		}
	
	public static int[] inSort(int[]arr){
		for (int i = 1; i < arr.length;i++){
			int v = arr[i];
			int j =i-1;
		
			while (j >= 0 && arr [j] > v) {
				
				arr[j+1] = arr [j];
				j--;
			} 
			
			arr [j+1]= v;
			
		} return arr;
		
	}

}
	