package com.mycompany.csc229_211review_lab02hw;

/**
 *
 * @author MoaathAlrajab
 */
public class Student extends Person{
	// ToDo 1: Make this class a child of Person
	
	// ToDo 2: Fix the resulting errors
	
	// ToDo 3: Add a field for GPA and create setter and getter
	
	// ToDo 4: Add comments to your code
    
    private double gpa;// private variable for gpa thats a double
    
    public Student(String name, short age){ //parameterized constructor thats a paramterized String and short value
        super(name,age); // calls the parent class constructor using the passed in variables to modify its private class members.
        
    }
            
    public double getGpa() { // method returns value stored in the Student class gpa member field
        return gpa;
    }

    public void setGpa(double gpa) { //method that sets the Student class gpa member field to the parameterized gpa 
        this.gpa = gpa;
    }
    
    @Override
    public String toString(){ // overrides toString method and returns this special string
        return "Name: " + getName() + "\n"
                + "Gpa: " + getGpa() + "\n";
    }
    
    @Override 
    public String getAddress(){ //implemented abstract method from Person class, all abstract methods from abstract class mustt be implemented
      return null;
        
    }
    
    @Override
    public void setAddress(String address){ 
    
    
    }
    
    

}