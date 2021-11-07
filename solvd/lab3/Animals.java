package com.solvd.lab3;

import java.util.Objects;

public class Animals {
	
	protected String name;
	protected int weigth; 
	protected String type;
	protected String skin;
	protected String gender;
	protected String movement;
	int speed;

	public Animals() {
		super (); 
	}
	
	public Animals(String name, int weigth, String type, String skin, String gender, String movement, int speed) {
		super();
		this.name=name;
		this.type=type;
		this.weigth=weigth;
		this.skin=skin;
		this.gender=gender;
		this.movement=movement;
		this.speed=speed;
	}
	
	public void typeOfAnimal() {
		System.out.println("Are" + type);
		
	}
	
	public void typeOfAnimal(String name, String type) {
		System.out.println( "It's  a "+ name+"," + " Are : " + type);
		
	}

	public void movement() {
		System.out.println(" It's " + movement);
		
	}

	@Override
	public String toString() {
		
		return "{" +
        " name:" + name + "" + ", gender: " + gender  +
        ", weigth: " + weigth +" kg " +  ", skin: " + skin + "}";
	}

	/*public boolean equals(Object obj) {
		
		if(obj instanceof Animals) {
			
			Animals a = (Animals)obj;
			
			if(this.name==a.name) {
				return true;
			
			}else {
				return false;
			}
			
		}else {
			return false;
		}
	}*/
	
	@Override
	public int hashCode() {
		return Objects.hash(gender, name, type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animals other = (Animals) obj;
		return Objects.equals(gender, other.gender) && Objects.equals(name, other.name)
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

	public String getSkin() {
		return skin;
	}

	public void setSkin(String skin) {
		this.skin = skin;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMovement() {
		return movement;
	}

	public void setMovement(String movement) {
		this.movement = movement;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	
	
	
	
}

