import java.util.Scanner;
import java.lang.ArithmeticException;

public class Task1 {

    public static void Numberguess() {

        Scanner sc = new Scanner(System.in);

        int number = 1 + (int) (100 * Math.random());
        System.out.println("ENTER HOW MANY ROUND YOU ARE PLAY");
        int round = sc.nextInt();

        int limit = 5,guess, i,score = 0,x = 1;

        for (int k = 0; k < round; k++) {

            System.out.println("enter number between 1 to 100");
            for (i = 0; i < limit; i++) {

                System.out.println("guess the number:");
                guess = sc.nextInt();

                if (guess == number) {
                    System.out.println("congratulation ! you won");
                    score += i;
                    break;
                } else if (guess > number && i != limit - 1) {
                    System.out.println("your number is greater than guess");
                } else if (guess < number && i != limit - 1) {
                    System.out.println("you number is lower than guess");
                }

            }
            if (i == limit) {
                System.out.println("----------------");
                System.out.println(+x++ + " ROUND FINISHED");
                System.out.println("----------------");

            }
        }
        try {

            float averageAttempts = 0;

            averageAttempts += score + round;

            System.out.println("all round finished Game over");

            System.out.println("total rounds:" + round);
            System.out.println("total score :" + averageAttempts + "%");
            sc.close();
        } catch (ArithmeticException ae) {
            System.out.println("the number was:" + number);
            System.out.println("you have not won in any round");
            System.out.println("well try");
            System.out.println("score=0.0");
        }

    }

    public static void main(String[] args) {

        Task1.Numberguess();

    }
}
