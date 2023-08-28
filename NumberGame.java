import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        int answer, guess;
        final int MAX = 100;
        Scanner s = new Scanner(System.in);
        Random rand = new Random();
        boolean correct = false;
        answer = rand.nextInt(MAX) + 1;

        while (!correct) {
            System.out.println("Guess a number between 1 to 100: ");
            guess = s.nextInt();

            if (guess > answer) {
                System.out.println("Too high, try again");
            } else if (guess < answer) {
                System.out.println("Too low, try again");
            } else {
                System.out.println("Yes, you guessed the number.");
                correct = true;
            }
        }
        s.close();
    }
}