import java.util.Random;
import java.util.Scanner;

public class dice {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Random r = new Random();

        int number1, number2;
        number1 = 1 + r.nextInt(6);
        number2 = 1 + r.nextInt(6);

        System.out.println("HERE COMES THE DICE!");
        System.out.println("Roll #1:" + number1);
        System.out.println("Roll #2:" + number2);
        System.out.println("The total is" + (+number2++ + number1) + "!");

        keyboard.close();
    }
}