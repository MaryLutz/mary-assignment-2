package com.coderscampus;

import java.util.Random;

import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {
		Random random = new Random();
		int randomNumber = random.nextInt(101);
		System.out.println("Random number is " + randomNumber);

		System.out.println("Pick a number between 1 nad 100.");
		int a = 100;
		int b = 0;
		int i = 1;
		while (i <= 5) {

			Scanner scanner = new Scanner(System.in);
			int guessNumber = scanner.nextInt();
			if (guessNumber > a || guessNumber <= b) {
				System.out.println("Pick a number between 1 and 100.");
			} else if (guessNumber == randomNumber) {
				System.out.println("You win!");
				return;
			} else if (guessNumber < randomNumber) {
				System.out.println("Please pick a higher number.");
				i++;
			} else if (guessNumber > randomNumber) {
				System.out.println("Please pick a lower number.");
				i++;
			}
		}
		System.out.println("You lose!");
		
	}
}
