
package com.solvd.lab3.sort;

import java.util.Arrays;

public class insertionSort {

	public static void main(String[] args) {
		
		int[] arr= {3, 7, 6, 13, 33, 9, -100, 25};
		
		int n= arr.length;
		
		System.out.println(n);
		
		sort(arr, n );
		
		System.out.println(Arrays.toString(arr));
	}


	static void sort(int[]arr,int n) {
	
	if(n<=1)  //base case (when there is only 1 element to sort)
 
		return;

	sort(arr, n - 1); // Recursive call to the function 
										// for sorting inner elements
	
	int last = arr[n-1];
	int j =n-2;
	
	for (;j>=0 && last < arr[j]; j--)
		arr[j+1]= arr[j];
		arr[j+1]=last;
	
	}

	}

	
