import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int low = 1, high = 100;
        boolean correct = false;

        while (!correct) {
            int guess = rand.nextInt(high - low + 1) + low;
            System.out.println("Computer guesses: " + guess);
            System.out.print("Enter feedback (high/low/correct): ");
            String feedback = sc.next();

            if (feedback.equalsIgnoreCase("correct")) {
                System.out.println("Computer guessed the number!");
                correct = true;
            } else if (feedback.equalsIgnoreCase("high")) {
                high = guess - 1;
            } else if (feedback.equalsIgnoreCase("low")) {
                low = guess + 1;
            }
        }
        sc.close();
    }
}
