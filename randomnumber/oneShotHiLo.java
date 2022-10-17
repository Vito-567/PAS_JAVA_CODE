
import java.util.Random;
import java.util.Scanner;

public class oneShotHiLo {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Random r = new Random();

        int number, userInput;
        number = 1 + r.nextInt(100);

        System.out.println("I'm thinking of a number between 1-100.  Try to guess it.");
        System.out.println(">");
        userInput = keyboard.nextInt();

        if (userInput > number) {
            System.out.println("Sorry, you are too high.  I was thinking of" + number + "!");
        }
        if (userInput < number) {
            System.out.println("Sorry, you are too low.  I was thinking of" + number + "!");
        } else {
            System.out.println("You guessed it!  What are the odds?!?");
        }
        keyboard.close();
    }
}