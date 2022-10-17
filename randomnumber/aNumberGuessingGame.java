import java.util.Random;
import java.util.Scanner;

public class aNumberGuessingGame {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Random r = new Random();

        int number, userInput;
        number = 1 + r.nextInt(10);

        System.out.print("I'm thinking of a number from 1-10");
        System.out.print("Your guess: ");
        userInput = keyboard.nextInt();

        if (userInput == number) {
            System.out.println("Thats right! My number was " + number + "!");
        } else {
            System.out.println("Sorry, but I was really thinking of" + number + ".");
        }
        keyboard.close();
    }
}