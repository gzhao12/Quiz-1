package pkgMain;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		// creates Scanner for user input
		Scanner input = new Scanner(System.in);

		// asks users for values
		System.out.print("What is the player's name? ");
		String name = input.nextLine();

		System.out.print("How many touchdowns did the player collect? ");
		int touchdowns = input.nextInt();

		System.out.print("How many yards did the player collect? ");
		int yards = input.nextInt();

		System.out.print("How many interceptions did thep player collect? ");
		int interceptions = input.nextInt();

		System.out.print("How many completions did the player collect? ");
		int completions = input.nextInt();

		System.out.print("How many passes did the player attempt? ");
		int passes = input.nextInt();

		input.close();

		// calculates variables for the rating calculation
		double a = (((double) completions / (double) passes) - .3) * 5;
		double b = (((double) yards / (double) passes) - 3) * .25;
		double c = ((double) touchdowns / (double) passes) * 20;
		double d = 2.375 - (((double) interceptions / (double) passes) * 25);

		// check variables to make sure none exceed 2.375 or go below 0, sets
		// values accordingly if they do
		if (a > 2.375)
			a = 2.375;
		else if (a < 0)
			a = 0;

		if (b > 2.375)
			b = 2.375;
		else if (b < 0)
			b = 0;

		if (c > 2.375)
			c = 2.375;
		else if (c < 0)
			c = 0;

		if (d > 2.375)
			d = 2.375;
		else if (d < 0)
			d = 0;

		// calculates and prints score
		double score = ((a + b + c + d) / 6) * 100;
		System.out.print(name + " has a QB rating of " + Math.round(score * 100) / 100.0);
	}
}
