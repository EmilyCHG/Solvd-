
package com.solvd.lab3;

import java.util.Objects;

public class EarthAnimal extends Animal{

	public EarthAnimal() {
		super();
		}
		String food;
		String sound;
		String skin;
		String gender;
		
		
		public void time(String name, int num) {
			System.out.println("the " + name + " has a time of life of " +  num + " years");
		}
		
		public void home(String name, String home) {
			System.out.println( name + "lives in " + home );
		}
		
		public void sleep(String name) {
			System.out.println( name + " is zzz... ");
		}
		
		public void animaleat(String name, String food) {
			System.out.println(name + " feeds on: " + food);
		}
		
		public void animalsound(String name, String sound) {
			System.out.println("the " + name + " makes a sound like: " + sound);
		}
		
		public void identification(String name, String type) {
			System.out.println("its a :" + name + "and are :" + type);
			
		}
		
		public void typeOfAnimal(int weight, String movement) {
			System.out.println( " Weight "+ weight +" kg," + " and are : " + movement);
		}
		
		public void movement() {
			System.out.println("moves on earth");
		}
		
		public String toString() {
			return "Animal [name=" + name + ", weigth=" + weigth + ", type=" + type + ", movement=" + movement + "]";
		}
		
		public void description(String skin, String gender) {
			System.out.println("type of skin :" + skin + " gender: " + gender);
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = super.hashCode();
			result = prime * result + Objects.hash(gender, name);
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
			EarthAnimal other = (EarthAnimal) obj;
			return Objects.equals(gender, other.gender) && Objects.equals(name, other.name);
		}

		
	
		
		
		
}

