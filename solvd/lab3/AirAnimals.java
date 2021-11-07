
package com.solvd.lab3;

public class AirAnimals extends Animals{
	int speed;
	
	public AirAnimals() {
		super ();
	}
		
		public void typeOfAnimal() {
			System.out.println("Are : " + type);
			
		}
		
		public void typeOfAnimal(String name, String type) {
			System.out.println( "It's  a "+ name +","+ " Are : " + type);
			
		}
		
		public void movement() {
			
			System.out.println(" It's " + movement );
		 
		}
		
		public void movement(int speed) {
			
			System.out.println(" It's " + movement + "with a velocity : " + speed + " km/h ");
		 
		}


		public String toString() {
			return " AirAnimals [" + super.toString() + "]";
		}
		
		
		
		
		
	}



