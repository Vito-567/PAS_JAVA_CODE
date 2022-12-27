//import libary here
import java.util.Scanner;
//import libary for radom number
import java.util.Random;

public class MathgameV3 
{

    //main
    public static void main ( String[] args ) {
        display_intro ();
        display_menu ();
        int choice = get_user_input ();

        System.out.println ( "Your choice is " + choice + ". " );
        int total = 0;
        int correct = 0;
        while ( choice != 5 ) {
            total = total + 1;
            correct = menu_option ( choice, correct );
            choice = get_user_input ();
            display_function ( total, correct );
        }
        System.out.println( "Exit the game." );
    }
    //introducing the game
    public static void display_intro () {
        //START
        System.out.println ( "Welcome to Vito's Math game" );
        System.out.println ( "**************************************************" );
        System.out.println ( "Here is my rules for the math game!" );
        System.out.println ( "Cannot use calculator" );
        System.out.println ( "No cheating" );
        System.out.println ( "Do it individually" );
        System.out.println ( "**************************************************" );
    }
    //menu
    public static void display_menu () {
        System.out.println ( "1. Addition" );
        System.out.println ( "2. Subtraction" );
        System.out.println ( "3. Multiplication" );
        System.out.println ( "4. Division" );
        System.out.println ( "5. Exit" );
        System.out.println ( "Enter your choice: " );
    }
    //accuracy
    public static void display_function ( int total, int correct ) {
        double accuracy = 0.0;
        if ( total > 0 ) {
            accuracy = (double) correct / total;
            System.out.println ( "You answered " + total + " questions!" );
            System.out.println( "Your accuracy is " + accuracy * 100 + "%. ");
        }
    }
    //input
    public static int get_user_input () {
        Scanner kb = new Scanner ( System.in );
        int userChoice = kb.nextInt ();
        while ( userChoice > 5 || userChoice <= 0 ) {
            System.out.println ( "Invalid choice, please choose the number between 1 to 5" );
            System.out.println ( "Enter your choice: " );
            userChoice = kb.nextInt ();
        }
        return userChoice;
    }
    //option
    public static int menu_option ( int index, int count ) {
        Random r = new Random ();
        int min = 1 ;
        int max = 100 ;
        int num1 = r.nextInt ( max - min ) + min;
        int num2 = r.nextInt ( max - min ) + min;
        System.out.println ( "random number 1 = " + num1 );
        System.out.println ( "random number 2 = " + num2 );

        if ( index == 1 ) {
            System.out.println("You select addition for your practice");
            String prob = num1 + " + " + num2 ;
            int true_solution = num1 + num2;
            int user_solution = get_user_solution(prob);
            count = check_solution ( user_solution, true_solution, count );
            System.out.println( "Enter your choice, tks" );
        }
        else if ( index == 2 ) {
            System.out.println( "You are selecting subtraction." );
            String prob = num1 + " - " + num2 ;
            int true_solution = num1 - num2;
            int user_solution = get_user_solution(prob);
            count = check_solution ( user_solution, true_solution, count );
            System.out.println( "Enter your choice! " );
        }
        else if ( index == 3 ) {
            System.out.println( "You are selecting multiplication." );
            String prob = num1 + " * " + num2 ;
            int true_solution = num1 * num2;
            int user_solution = get_user_solution(prob);
            count = check_solution ( user_solution, true_solution, count );
            System.out.println( "Enter your choice! " );
        }
        else if ( index == 4 ) {
            System.out.println( "You are selecting division." );
            String prob = num1*5 + " / " +5 ;
            int true_solution = num1*5/5 ;
            int user_solution = get_user_solution(prob);
            count = check_solution ( user_solution, true_solution, count );
            System.out.println( "Enter your choice! " );
        }

        return count;
    }
    //check solution
    public static int check_solution ( int my_user_solution, int my_true_solution, int count ) {
        if ( my_user_solution == my_true_solution ) {
            System.out.println("You are CORRECT! Continue your practice");
            count = count + 1;
        }
        else {
            System.out.println ( "You are WRONG kid! try it again one more time." );
            System.out.println ( "Let's try a new kind of practice!" );
        }
        return count;
    }
    //get user solution
    public static int get_user_solution ( String prob ) {
        System.out.println ( prob + " " );
        System.out.println ( "Enter your solution: " );
        Scanner kb2 = new Scanner ( System.in);
        int userSolution = kb2.nextInt ();
        return userSolution;
    }
} {
    
}
