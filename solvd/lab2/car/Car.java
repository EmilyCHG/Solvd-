
package com.solvd.lab2.car;

public class Car extends Vehicle {
	
	public Car(boolean isMoving) {
		super(true);
		model = "tesla";
		maxSpeed= 200;
		isMoving = false;
	}
	
	
	/*public Car() {
		model = "tesla";
		maxSpeed= 200;
		isMoving = false;
	}
	
	public Car(String model) {
		this.model= model;
	}
	*/
	
}
