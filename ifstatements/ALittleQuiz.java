package ifstatement;

import java.util.Scanner;

public class ALittleQuiz
{
	public static void main( String[] args )
	{

        Scanner scanner = new Scanner(System.in);
        
        System.out.println();

        System.out.println( "Are you ready for a quiz? " );  
        scanner.next();
        System.out.println( "Okay, here it comes! " );  
       
        int score = 0;

        System.out.println();
        
        System.out.println( "What is the capital of Alaska? " );  
        System.out.println( "1. Melbourne    2. Anchorage    3. Juneau " );  
        int answer = scanner.nextInt();
		if (answer == 3)
        {
            System.out.println( "That's right!" );  
            score  += 1;
        }
        else
        {
            System.out.println( "That's wrong." );  
        }

        System.out.println();

        System.out.println( "Can you store the value \"cat\" in a variable of type int?" );  
        System.out.println( "1. Yes    2. No" );  
        answer = scanner.nextInt();
		if (answer == 2)
        {
            System.out.println( "That's right!" );  
            score  += 1;
        }
        else
        {
            System.out.println( "That's wrong." );  
        }

        System.out.println();

        System.out.println( "What is the result of 9+6/3?" );  
        System.out.println( "1. 5    2. 1    3. 3+6/3 " );  
        answer = scanner.nextInt();
		if (answer == 2)
        {
            System.out.println( "That's right!" );  
            score  += 1;
        }
        else
        {
            System.out.println( "That's wrong." );  
        }

        System.out.println("Overall, you got " + score + " out of 3 correct.");
        System.out.print("Thanks for playing. ");
      
        scanner.close();
	}
}