import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Random rand = new Random();
        int secretNumber = rand.nextInt(50) + 30; // generate number between 30 and 79
        int attempts = 0;
        Scanner input = new Scanner(System.in);
        int guess;
        boolean won = false;

        while (!won) {
            System.out.println("Guess a number between 30 and 79:");
            guess = input.nextInt();
            attempts++;

            if (guess == secretNumber) {
                won = true;
            } else if (guess < secretNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }
        }

        System.out.println("Congratulations! You found the secret number in " + attempts + " attempts.");
    }
}