
package com.solvd.lab3;

import java.util.Objects;

public class AirAnimal extends Animal{
	
	public AirAnimal() {
		super ();
	}
		
		String type;
		int speed;
		String home;
		int num;
		

		public void time(int num) {
			System.out.println( "the " + name + " has a time of life of " +  num + " years");
		}
		
		public void home(String name, String home) {
			System.out.println(name + ", Lives on " + home );
		}
		
		public void sleep(String name) {
			System.out.println( "the " + name + " is zzz... ");
		}
			
		public void animaleat(String name, String food) {
			System.out.println(name + " feeds on: " + food);
		}
		
		public void animalsound(String name, String sound) {
			System.out.println("the " + name + " makes a sound like: " + sound);
		}
		
		public void identification(String name, String type) {
			System.out.println("its a: " + name + " and are: " + type);
			
		}
		
        public void typeOfAnimal(int weight, String movement) {
			System.out.println( " Weight "+ weight+" kg," + " and are: " + movement);
		}
        
		public void movement( int speed) {
			System.out.println(" It's " + movement + " with a velocity " + speed+ "km/h");
		}
		
		public void description(String skin, String gender) {
			System.out.println("type of skin: " + skin + ", gender: " + gender);
		}
	
		public String toString() {
			return "Animal [name=" + name + ", weigth=" + weigth + ", type=" + type + ", movement=" + movement + "]";
		}
		
		public int getSpeed() {
			return speed;
		}

		public void setSpeed(int speed) {
			this.speed = speed;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = super.hashCode();
			result = prime * result + Objects.hash(name, type);
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (!super.equals(obj))
				return false;
			if (getClass() != obj.getClass())
				return false;
			AirAnimal other = (AirAnimal) obj;
			return Objects.equals(name, other.name) && Objects.equals(type, other.type);
		}

		
		
		
		
		
		
	}



