import java.util.Scanner;

public class NameAgeAndSalary {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int age, Salary;
        String Name;

        System.out.print("Hello, what is your name");
        Name = keyboard.next();

        System.out.println("Okay " + Name + ", how old are you?");
        age = keyboard.nextInt();

        System.out.print("You're " + age + "??? Yeah you're gonna die soon. BTW, how much do you make, " + Name + "");
        Salary = keyboard.nextInt();

        System.out.println("Only " + Salary + "Why don't you do it?");
        keyboard.close();
    }
}