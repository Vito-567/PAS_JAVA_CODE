import java.util.Random;
import java.util.Scanner;

public class threeCupMonte {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Random r = new Random();

        int number, userInput;
        number = 1 + r.nextInt(3);

        System.out.print(
                "You slide up to Fast Eddie's card table and plop down your cash.\nHe glances at you out of the corner of his eye and starts shuffling.\nHe lays down three cards.");
        System.out.println("Which one is the ace? ");
        System.out.println("	##  ##  ## ");
        System.out.println("	##  ##  ## ");
        System.out.println(">");
        userInput = keyboard.nextInt();

        if (userInput != number) {
            System.out.println("Ha! Fast Eddie wins again! The ace was card number " + number + "!");
            System.out.println("	##  AA  ## ");
            System.out.println("	##  AA  ## ");
            System.out.println("	1   2   3 ");
        } else {
            System.out.println("You nailed it! Fast Eddie reluctantly hands over your winnings, scowling.");
            System.out.println("	##  AA  ## ");
            System.out.println("	##  AA  ## ");
            System.out.println("	1   2   3 ");
        }
        keyboard.close();
    }
}