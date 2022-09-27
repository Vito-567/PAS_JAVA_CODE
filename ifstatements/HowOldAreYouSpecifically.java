package ifstatement;
import java.util.Scanner;

public class HowOldAreYouSpecifically
{
	public static void main( String[] args )
	{

        Scanner scanner = new Scanner(System.in);
		
        System.out.print( "What's your name? " );   
        String name = scanner.next();
        
        System.out.println();
        System.out.print( "Okay, " + name + ". What is your age? " );  
      
        int age = scanner.nextInt();
        System.out.println();
		
		if ( age < 16 )
		{
			System.out.println(  "You can't drive, vote, and rent a car, " +name );   
        }
        else if ( age < 18 )
		{
			System.out.println( "You can drive, but not vote and rent a car " +name );
        }
        else if ( age < 25 )
		{
			System.out.println( "You can drive and vote, but you can't rent a car, " + name );
        }
        else
		{
			System.out.println( "You can do anything that's legal, " +name );
        }

        scanner.close();
	}
}