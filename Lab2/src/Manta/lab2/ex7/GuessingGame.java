package Manta.lab2.ex7;
import java.util.Scanner;
public class GuessingGame {
        public static void main(String[] args) {

            int secretNumber;

            secretNumber = (int) (Math.random() * 99 + 1);

            Scanner keyboard = new Scanner(System.in);

            int guess,n=1;

            do {

                System.out.print("Enter a guess (1-100): ");

                guess = keyboard.nextInt();

                if (guess == secretNumber)

                    System.out.println("Your guess is correct. Congratulations!");

                else if (guess < secretNumber)

                    System.out

                            .println("Wrong answer, your number is too low'");

                else if (guess > secretNumber)

                    System.out

                            .println("Wrong answer, your number it too high'");
                n +=1;
            } while (guess != secretNumber && n<=3);
            if (n == 3)
                System.out.println("Game Over!");

        }
}
