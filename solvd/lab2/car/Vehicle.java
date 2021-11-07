
package com.solvd.lab2.car;


public class Vehicle {
	
	protected String model;
	public int maxSpeed;
	protected boolean isMoving;
	
	//object parent 
	Vehicle(boolean isMoving){
		this.isMoving = isMoving;
	}



	public int getMaxSpeed() {
		return maxSpeed;
	}



	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}



	public String getModel() {
		return model;
	} 



	public void setMoving(boolean isMoving) {
		this.isMoving = isMoving;
	}



	public boolean isMoving() {
		return isMoving;
	}

	
	
	public void drive() {
		System.out.println("vehicle is driving");
	}
	
	public void drive(int Speed) {
		System.out.println("vehicle is driving" + Speed);
	}
	
	public void stop() {
		
	}
}
