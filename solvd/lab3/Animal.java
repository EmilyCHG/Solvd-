package com.solvd.lab3;

import java.util.Objects;

public class Animal implements IAnimalSound, IAnimalSleep, IAnimalTime, IHome, IAnimalEat {
	
	protected String name;
	protected int weigth; 
	protected String type;
	protected String movement;
	int num;
	String home;

	public Animal() {
		super (); 
	}

	public Animal(String name, int weigth, String type, String movement) {
		super();
		this.name=name;
		this.type=type;
		this.weigth=weigth;
		this.movement=movement;
	}	

	
	public void identification(String name, String type) throws EqualsException {
		
		if(name.equals(type)) {
			throw new EqualsException();
		}
			System.out.println("its a: " + name + "and are: " + type);
	}
		 	
	public void typeOfAnimal(int weight, String movement) throws WrongNumberException {
		
		if (weight<0 || weight>10000) {
			throw new WrongNumberException();
		}
			System.out.println( " Weight " + weight +" kg," + " and are: " + movement);
	}

	public void movement() {
		System.out.println(" It's " + movement);	
	}
	
	public void description(String skin, String gender) {
		System.out.println(" It has " + skin + " and it gender is " + gender);
	}	
	
	
	public String toString() {
		return "Animal [name=" + name + ", weigth=" + weigth + ", type=" + type + ", movement=" + movement + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(movement, name, type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		return Objects.equals(movement, other.movement) && Objects.equals(name, other.name)
				&& Objects.equals(type, other.type);
	}

	public void setName(String name) {
		this.name = name;
	}


	public int getWeigth() {
		return weigth;
	}


	public void setWeigth(int weigth) {
		this.weigth = weigth;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}

	public String getMovement() {
		return movement;
	}

	public void setMovement(String movement) {
		this.movement = movement;
	}

	public void eat() {
		// TODO Auto-generated method stub
		
	}


	public void home() {
		// TODO Auto-generated method stub
		
	}


	public void time() {
		// TODO Auto-generated method stub
		
	}

	public void animalSleep() {
		// TODO Auto-generated method stub
		
	}

	
	public void animalSound() {
		// TODO Auto-generated method stub
		
	}
	
	public void time(String name, int num) throws WrongNumberException  {
		
		if(num>=100 || num <=0 ) {
			throw new WrongNumberException();
		}
		
		System.out.println( "the " + name + " has a time of life of " +  num + " years");
	}

	public void home (String name, String home) throws WrongLengthException {
	
		if (name.length() <=2 || (home.length() <=2)) {
					throw new WrongLengthException();
		}
		System.out.println( name + " Lives in: " + home);
	
	}		 
	       
	
	public void animalSound(String name, String sound) throws EqualsException {
		if (name.equals(sound)) {
			throw new EqualsException();
		} 
		System.out.println( name + " do a sound like a  " + sound);
	}
	
	
	public void eat(String name, String food) throws EmptyVarException {
	
		if(name.isEmpty() ||  food.isEmpty() ) {
			throw new EmptyVarException();
		}
		System.out.println(name + " feeds on: " + food);
	}
	
	
	public void animalSleep(String name) {
		System.out.println( name + " is zzz... ");
		
	}
		

	
	
}

