package exercise2;

import java.util.Random;

public class Lotto {

	/*
	 * Design a Lotto class with one array instance variable to hold three random
	 * integer values (from 1 to 9). Include a constructor that randomly populates
	 * the array for a lotto object. Also, include a method in the class to return
	 * the array.
	 * 
	 * Use this class to simulate a simple lotto game in which the user chooses a
	 * number between 3 and 27. The user runs the lotto up to 5 times and each time
	 * the sum of lotto numbers is calculated. If the number chosen by the user
	 * matches the sum, the user wins and the game ends. If the number does not
	 * match the sum within five rolls, the computer wins.
	 */
	Random rand = new Random();

	int[] randInt = new int[3];

	public Lotto(int[] randInt) {
		this.randInt = randInt;
	}

	public Lotto() {
		for (int num = 0; num < randInt.length; num++) {
			randInt[num] = rand.nextInt((9 - 1) + 1) + 1;
		}
	}

	public int[] arrayLotto() {
		return randInt;
	}
}
