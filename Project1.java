/*
1. Sum A + B
A sum-based project is a great way to get started with Java programming. The project is quite simple — the user will input two numbers (which are treated 
		as the variables A and B), and the program will add them together and present the sum of A + B. This can help you learn to work with methods and integers. 
JavaTPoint offers a great guide for a Sum A + B project, and working through this type of project can help you become familiar with Java processes.
*/

import java.util.Scanner; // import scanner to capture user input

public class Project1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); // create scanner
		System.out.println("Please Enter The First Number"); // ask user to enter the number
		int userInput1 = scan.nextInt(); // creating a variable that user the scanner to capture the user input
		System.out.println("Please Enter The Second Number"); // repeat steps above
		int userInput2 = scan.nextInt();
		int total = (userInput1 + userInput2); // calculate the total by adding together the two user inputs 
		System.out.println("The total of the two numbers is " + total); // print to the user the total
		
		
	}

}
