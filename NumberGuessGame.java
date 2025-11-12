import java.util.Scanner;
import java.util.Random;

public class NumberGuessGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random r = new Random();

        int target = r.nextInt(100) + 1;   // number between 1 and 100
        int guess = 0;
        int tries = 0;

        System.out.println("Welcome to the Number Guess Game!");
        System.out.println("Guess the number (between 1 and 100):");

        while (guess != target) {
            System.out.print("Your guess: ");
            guess = input.nextInt();
            tries++;

            if (guess > target) {
                System.out.println("Too high, try again!");
            } else if (guess < target) {
                System.out.println("Too low, try again!");
            } else {
                System.out.println("You got it! Number was " + target + ".");
                System.out.println("Total attempts: " + tries);
            }
        }

    }
}
