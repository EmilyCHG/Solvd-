
package com.solvd.lab3;

public interface IGeneric <T> {

	T pop() ;
	T peek();
	boolean isEmpty();
	/**
	 * @param v
	 */
	void push(T v);

	
}
