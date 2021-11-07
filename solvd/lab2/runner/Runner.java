package com.solvd.lab2.runner;
 import com.solvd.lab2.car.Car;
import com.solvd.lab2.car.Bicycle;

public class Runner {
	
	public static void main (String [] args) {
		Car car = new Car(true);
		System.out.println(car.getModel());
		System.out.println("Max Speed of car: " + car.getMaxSpeed());
		
		Bicycle bicycle = new Bicycle(false);
		bicycle.maxSpeed=15;
		System.out.println("max Speed of bicycle: " + bicycle.maxSpeed);
	}

}
