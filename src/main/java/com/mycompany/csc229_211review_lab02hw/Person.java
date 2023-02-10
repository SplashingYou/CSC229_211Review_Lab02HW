package com.mycompany.csc229_211review_lab02hw;

/**
 *
 * @author MoaathAlrajab
 */
public abstract class Person {
	
	private String name; // private variable for name thats a String
	private String address; // private variable for address thats a String
	private short age; // private variable for age thats a short
	
	// constructor that takes only two parameters
	public Person(String name, short age) {// takes a String and short prim type parameter 
		super(); //calls default instructor
		this.name = name; // sets the class member name to parameterized name thats passed
		this.age = age; // sets the class member age to parameterized age thats passed
	}
	
	public String getName() { // method returns value stored in the Person class name member field
		return name;
	}
	
	public void setName(String name) { //method that sets the Person class name member field to the parameterized name 
		this.name = name;
	}
	
	public abstract String getAddress(); ; // abstract method that returns a string and must be implemented if another class derives from it
	
	public abstract void setAddress(String address); // abstract parameterized method that accepts a passed in string and must be implemented if another class derives from it
	
	
	public short getAge() { // method returns value stored in the Person class age member field 
		return age;
	}
	
	public void setAge(short age) { //method that sets the Person class age member field to the parameterized age
		this.age = age;
	}
	
}
