import java.util.Scanner;

public class TheForgetMachine {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int firstFavoriteNumber, secondFavoriteNumber;
        String firstFavoriteWord, secondFavoriteWord;

        System.out.print("Give me a word");
        firstFavoriteWord = keyboard.next();

        System.out.println("" + firstFavoriteWord + "");

        System.out.print("Give me a second word");
        secondFavoriteWord = keyboard.next();

        System.out.println("" + secondFavoriteWord + "");

        System.out.print(" Now, give me your favorite number ");
        firstFavoriteNumber = keyboard.nextInt();

        System.out.println("" + firstFavoriteNumber + "");

        System.out.print("Then, give me your second favorite number ");
        secondFavoriteNumber = keyboard.nextInt();

        System.out.println("" + secondFavoriteNumber + "");
        System.out.println("Whew that was fun, wasn't it?");
        keyboard.close();
    }
}