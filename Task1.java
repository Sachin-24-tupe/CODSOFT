import java.util.Scanner;

public class Task1 {

    public static void Numberguess() {

        Scanner sc = new Scanner(System.in);

        int number = 1 + (int) (100 * Math.random());
        System.out.println("ENTER HOW MANY ROUNDS YOU WANT TO PLAY");
        int round = sc.nextInt();

        int limit = 5, guess, i, score = 0, x = 1;

        for (int k = 0; k < round; k++) {

            System.out.println("Round " + (k + 1) + ": enter a number between 1 to 100");
            for (i = 0; i < limit; i++) {

                System.out.println("Guess the number:");
                guess = sc.nextInt();

                if (guess == number) {
                    System.out.println("CONGRATULATIONS! YOU WON");
                    score++;
                    break;
                } else if (guess > number) {
                    System.out.println("Your number is greater than the guess.");
                } else {
                    System.out.println("Your number is lower than the guess.");
                }
            }
            if (i == limit) {
                System.out.println("----------------");
                System.out.println("Round " + x++ + " FINISHED");
                System.out.println("----------------");
            }
        }

        try {
            int averageAttempts = score;

            System.out.println("All rounds finished. Game Over");
            System.out.println("Total rounds: " + round);
            System.out.println("Total score: " + ++averageAttempts + "%");
            sc.close();
        } catch (ArithmeticException ae) {
            System.out.println("The number was: " + number);
            System.out.println("You have not won in any round.");
            System.out.println("Well try.");
            System.out.println("Score: 0.0%");
        }
    }

    public static void main(String[] args) {
        Task1.Numberguess();
    }
}
