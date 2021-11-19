
package com.solvd.lab3;

import java.util.Objects;

public class AirAnimal extends Animal{
	
	public AirAnimal() {
		super ();
	}
		
		String type;
		int speed;
		int num;
			
		public void movement( int speed) {
			System.out.println(" It's " + movement + " with a velocity " + speed+ "km/h");
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



