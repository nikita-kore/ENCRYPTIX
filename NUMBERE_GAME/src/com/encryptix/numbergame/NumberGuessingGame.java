package com.encryptix.numbergame;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		int score = 0;
		int rounds = 0;

		while (true) {
			int numberToGuess = random.nextInt(100) + 1; // Random number between 1 and 100
			int attemptsLeft = 10;
			rounds++;

			System.out.println("\n****************************** PLAY THE GAME ROUND : " + rounds
					+ " **************************\n");
			System.out.println(" YOU HAVE SELECTED A NUMBER BETWEENI 1 AND 100 \n");
			System.out.println(" YOU HAVE 10 ATTEMPTS TO GUESS THE NUMBER \n ");

			System.out.println("******************************* START NOW ***************************************\n");

			while (attemptsLeft > 0) {
				System.out.println("\n Enter your guess (Attempts left: " + attemptsLeft + "): ");

				System.out
						.println("***********************************************************************************");

				String input = scanner.nextLine();

				// Validate input
				int guess;
				try {
					guess = Integer.parseInt(input);
				} catch (NumberFormatException e) {
					System.err.println("\n Please enter a valid number.");
					continue;
				}

				// Compare guess with the generated number
				if (guess == numberToGuess) {
					System.out.println(" \n Congratulations!!!! You guessed the correct number!");
					score++;
					break;
				} else if (guess < numberToGuess) {
					System.err.println("\n Your guess is too low.");

				} else {
					System.err.println("\n Your guess is too high.");
				}

				attemptsLeft--;
			}

			if (attemptsLeft == 0) {
				System.err.println("\n 1"
						+ "\n Sorry, you've run out of attempts. The correct number was " + numberToGuess + ".");
			}

			// Ask the user if they want to play another round
			System.out.print("\n Do you want to play another round? (yes/no): ");
			String playAgain = scanner.nextLine().trim().toLowerCase();
			if (!playAgain.equals("yes")) {
				break;
			}
		}

		System.out.println("\n Game over!");
		System.out.println("\n You played " + rounds + " rounds and your score is " + score + ".");
		System.out.println("\n THANKS FOR PLAYING!!!");
		scanner.close();
	}
}
