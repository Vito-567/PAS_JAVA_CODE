import java.util.Scanner;

public class AgeInFiveYears {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int age;
        String Name;

        System.out.print("Hi, what is your name? ");
        Name = keyboard.next();

        System.out.print("Hi, " + Name + " How old are you? ");
        age = keyboard.nextInt();

        System.out.println("" + Name + ", did you know that 5 years later you will be " + (+age + +5));

        System.out.println("Also, 5 years ago you were " + (+age + -5));
        keyboard.close();

    }
}