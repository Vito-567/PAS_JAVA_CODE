package guis;

import java.util.Scanner;
public class TheWorstNumberGuessingGameEver
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		int secretnumber = 6;

		System.out.print( "TEH WORST NUBMER GESSING GAME EVAR!!!!!!!1!" );

		System.out.print( "I\"M THKING OF A NBR FROM 1-10.  TRY 2 GESS!" );
		int guess = keyboard.nextInt();

        if ( guess != secretnumber )
		{
			System.out.println(  "W00T!  U SUX0R!!!  I PWN J00!!!  IT WAS " + secretnumber + "!");   
        }
        else
		{
			System.out.println( "LOL!!! U GOT IT!  I CANT BELEIVE U GESSED IT WAS " + secretnumber + "!");
        }
        keyboard.close();
	}
}