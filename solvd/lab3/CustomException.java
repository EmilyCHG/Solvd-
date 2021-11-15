
package com.solvd.lab3;

public class CustomException extends Exception {

	
	private static final long serialVersionUID = 1L;

	@Override
	public String getMessage(){
		return "Custom Exception is Happened"; 
	}
}
