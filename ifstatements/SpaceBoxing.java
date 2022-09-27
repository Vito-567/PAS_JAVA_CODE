package ifstatement;

import java.util.Scanner;

public class SpaceBoxing
{
	public static void main( String[] args )
	{

        Scanner scanner = new Scanner(System.in);
		
        System.out.print( "What is your weight? " );   
        int weight = scanner.nextInt();
        
        System.out.println();

        System.out.println( "I have information for the following planets: " );  
        System.out.println( "   1. Venus   2. Mars    3. Jupiter " );  
        System.out.println( "   4. Saturn  5. Uranus  6. Neptune " );  
                
        System.out.println();
        
        System.out.print( "What's your Planet? " );  
        int planet = scanner.nextInt();
		
        double gravity = -1;

		if ( planet == 1 )
		{
            gravity = 0.78;
        }
        else if ( planet == 2 )
		{
            gravity = 0.39;
        }
        else if ( planet == 3 )
		{
            gravity = 2.65;
        }
        else if ( planet ==4 )
		{
            gravity = 1.17;
        }
        else if ( planet == 5 )
		{
            gravity = 1.05;
        }
        else if ( planet == 6 )
		{
            gravity = 1.23;
        }

        if ( gravity > 0 )
        {
            System.out.println("Your weight on that planet is " +(weight * gravity));
        }
        else
		{
			System.out.println( "The planet number has to be 1-6" );
        }
        scanner.close();
	}
}