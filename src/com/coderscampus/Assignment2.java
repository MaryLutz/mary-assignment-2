package com.coderscampus;

import java.util.Random;
import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {
		Random random = new Random();
		int randomNumber = random.nextInt(101);
		System.out.println("Random number is " + randomNumber);
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Pick a number between 1 nad 100.");

		int i = 1;
		while (i <= 5){
		int guessNumber = scanner.nextInt();
				
		if (guessNumber == randomNumber) {
			System.out.println("You win!");
			return;
		}
		 
		else if (guessNumber < randomNumber){
			System.out.println("Please pick a higher number.");	
			 i++;
		} 
		
		else if(guessNumber > randomNumber){
			System.out.println("Please pick a lower number.");
			 i++;
		}
		
	}
		System.out.println("You lose!");
		
	}
}
		
			
		



