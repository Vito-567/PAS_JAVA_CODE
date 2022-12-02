
//import libary here
import java.util.Scanner;
//import libary for radom number
import java.util.Random;

public class MathgameV2 {
    public static void main(String[] args) {
        display_intro();
        // call display emu function
        display_menu();
        // call the get user input funtion
        int choice = get_user_input();
        int count = 0;
        System.out.println("your choice is   " + choice);
        System.out.println(menu_option(choice, count));
        System.out.println(get_user_solution(""));
    }

    // creat a display introduction for the game
    public static void display_intro() {
        // call display menu function
        System.out.println("Welcome to Vito's math game");
        System.out.println("********************************");
        System.out.println("Game rules:");
        System.out.println("Don't cheat");
        System.out.println("Cannot use calculator");
        System.out.println("Don't forget to rate my game for 100! Most important!");
        System.out.println("");

    }

    // create a display menu function
    public static void display_menu() {
        System.out.println("");
        System.out.println("1. Addition");
        System.out.println("2. Substraction");
        System.out.println("3. Multiplaction");
        System.out.println("4. Division");
        System.out.println("5. Exit");

    }

    // create get user input function

    public static int get_user_input() {
        // create a scanner object
        Scanner kb = new Scanner(System.in);
        // ask user to key in
        int userChoice = kb.nextInt();

        // create a while loop to control user input
        while (userChoice > 1 || userChoice <= 0) {
            System.out.println("You can only choose addition, haha");
            System.out.println("enter your choice");
            userChoice = kb.nextInt();
        }
        // return to userChoice
        return userChoice;
    }

    public static int menu_option(int index, int count) {
        // create two random number name number1, number2
        // create random object
        Random r = new Random();
        int min = 10;
        int max = 100;
        int number_one = r.nextInt(max - min) + min;
        int number_two = r.nextInt(max - min) + min;
        System.out.println("random number1 = " + number_one);
        System.out.println("random number2 = " + number_two);

        String prob = number_one + "+" + number_two;
        int true_solution = number_one + number_two;
        int user_solution = get_user_solution(prob);
        count = check_solution(user_solution, true_solution, count);

        return count;
    }

    public static int check_solution(int my_user_solution, int my_true_solution, int count) {
        if (my_user_solution == my_true_solution) {
            System.out.println("you are CORRECT, well done");
        }

        else {
            System.out.println("Hey kid, try it again!");
        }
        return count;
    }

    public static int get_user_solution(String prob) {
        System.out.println(prob + "");
        System.out.println("enter your solution");
        Scanner kb2 = new Scanner(System.in);
        int userSolution = kb2.nextInt();
        return userSolution;
    }
}
