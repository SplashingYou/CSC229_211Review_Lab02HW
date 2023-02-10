package com.mycompany.csc229_211review_lab02hw;

import java.util.Scanner;

/**
 *
 * @author MoaathAlrajab
 */
public class DriverClass {
	
	public static void main(String[] args) {
                Scanner scnr = new Scanner(System.in); // creates scanner object
		// ToDo 5: Fix the error
		
		// ToDo 6: Fix the constructor of Student class
		
		// ToDo 7: Add a toString method for Student class
		
		Student std1= new Student("James", (short)20); //Calls Student parameterized constructor with a Stirng and a "short" value
		
		// ToDo 8: Set the gpa of the student using the scanner and user
		// 			input and then print the output.
		std1.setGpa(scnr.nextDouble()); //method to change the GPA variable value
                
		System.out.println(std1); // Uses the to overriden toString method from Student class
		
		// ToDo 9: add comments and explain your code
		
		// ToDo 10: submit using a pull request.
	}

}