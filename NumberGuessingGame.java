/* 
 * This is a simple game that can help you get your feet wet with Java. 
 * The game is relatively simple — the computer generates a random number, 
 * and the user must guess the number. The computer will then let the user 
 * know that their guess is too high, too low, or correct. This can be free-form, 
 * allowing an unlimited number of guesses, or give the user a set number of guesses 
 * before the game ends. Number guessing games involve some Java programming basics like
 *  accepting inputs from the user, creating classes, and using conditional statements. 
 *  GeeksforGeeks offers a number guessing game walkthrough that can help you get started.
 */

import java.util.Random;
import java.util.Scanner;
public class NumberGuessingGame {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); // creates a scanner
		Random random = new Random(); // creates the random 
		int randomInt = (int)(Math.random() * 100) + 1; // creating the random number
		int numGuessLeft = 10; // set the number of guesses the user will have
		int userGuess;
		
		
		System.out.println("Welcome to the number guessing game");
		System.out.println("Guess the number 1 - 100, you have 10 guesses");
	
		
		while(numGuessLeft > 0) { // creates while loop that will accept user input util the user has no guesses left
			if(scan.hasNextInt()) { // if statement that makes sure that the user only enter an int
				userGuess = scan.nextInt(); // ask for the user guess
				scan.nextLine(); // capture the user guess
				numGuessLeft--; // subtract the amount of guesses left by 1
				
				if(userGuess == randomInt) {
					System.out.println("GOOD JOB!!!, you guessed it correctly with " + numGuessLeft + " guesses left");
					break;
				}
				if(userGuess > 101) {
					System.out.println("Out of range: you have " + numGuessLeft + " guesses left" );
					continue;
				}
				if(userGuess < 1) {
					System.out.println("Out of range: you have " + numGuessLeft + " guesses left");
					continue;
				}
				
				if(userGuess != randomInt) {
					if(userGuess < randomInt) {
						System.out.println("Too Low, try again: " + "you have " + numGuessLeft + " guesses left");
					}
					if(userGuess > randomInt) {
						System.out.println("Too High, try again: " + "you have " + numGuessLeft + " guesses left");
					}
					continue;
				} 

			}else {
				numGuessLeft--;
				System.out.println("Please enter a valid input: you have " + numGuessLeft + " guesses left" );
				scan.nextLine();
				
			}

		}
		if(numGuessLeft == 0) {
			System.out.println("You have run out of tries, GAME OVER");	
		}
		scan.close();			
	}
}
