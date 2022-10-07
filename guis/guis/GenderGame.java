package guis;

import java.util.Scanner;

public class GenderGame 
{
    public static void main( String[] args )
    {

        Scanner scanner = new Scanner(System.in);

        System.out.println();

        System.out.print( "What is your gender (m or f): " );  
        String gender = scanner.next();

        System.out.print( "First name: " );  
        String fName = scanner.next();

        System.out.print( "Last name: " );  
        String lName = scanner.next();

        System.out.print( "age: " );  
        int age = scanner.nextInt();

        System.out.print( "Are you married? (y or n): " );  
        String married = scanner.next();

        System.out.println();

        if ( age < 20 )
        {
            System.out.println( "Then I shall call you " + fName + " " + lName );
        }
        else if (gender.equals("m"))
        {
            System.out.println("Then I shall call you Mr. " +lName + "."); 
        }  
        else if (married.equals("y"))
        {
            System.out.println("Then I shall call you Mrs. " +lName + "."); 
        }   
        else
        {
            System.out.println("Then I shall call you Ms. " + lName +  ".");
        }

        scanner.close();
    }
}