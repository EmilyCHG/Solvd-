
package com.solvd.lab3;

import java.util.Objects;

public class EarthAnimal extends Animal {

	public EarthAnimal() {
		super();
		}
	
		String skin;
		String gender;
		String food;
		String sound;

	
		@Override
		public void description(String skin, String gender) {
			System.out.println(" It has " + skin + " and it gender is " + gender);
			
		}	
		
		@Override
		public void movement() {
		System.out.println("moves on earth");
		
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



		
	
		
		
		


