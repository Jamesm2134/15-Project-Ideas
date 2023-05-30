/*
 In Java, strings refer to sequences of characters that behave like an object within the Java environment. It’s a very common and widely used Java data structure, 
 storing data in an array of characters. Creating a simple application that reverses a string can help you understand strings and how they’re used in a Java environment.
 For example, creating a program that reverses a string the user enters (e.g., “HELLO” to “OLLEH”). This project has many possible solutions, 
 which is a key concept to understand as you start coding. And, oftentimes the best solution can change depending on the attributes and objective of the project you’re working on.
Check out the guide from JavaTutoring to learn more about reverse-string projects and the multiple solutions available.


 */
import java.util.Scanner;
public class ReversingString {
	
	public static void main(String[] args) {
		String reversedString = ""; //empty string
		String name = "James"; // using this string instead of a user input
		for(int i = name.length() - 1; i >=0 ;i--) { // for the loop, I set i to the name.length, the length to be greater than 0 and i to decrease by one.
			reversedString += name.charAt(i); // calling the reversed string, we add i to it. using charAt captures the string itself instead of the number
			
			
			 
		}
		System.out.println(reversedString); // printing out the whole string reversed
		
		
		
		// same thing but using a user input
		
		Scanner scan = new Scanner(System.in); // create the scanner
		System.out.println("Using a user input, enter in a string to be reversed below: "); // tell the user to enter a string
		String scanInput = scan.nextLine(); // capture the string and set it to scanInput
		String reversedInput = ""; // have this empty string here ready to add the reversed letter to
		
		
		
		for (int i = scanInput.length() - 1; i >= 0; i--) { // for loops that runs backwards through the user input string
			reversedInput += scanInput.charAt(i); // add the letter the the empty string
		}
		
		System.out.println(reversedInput); // print it out
		
		
		
		
		
		
	}

}
