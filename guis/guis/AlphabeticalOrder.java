package guis;

import java.util.Scanner;
public class AlphabeticalOrder
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);



		System.out.print( "What is your last name? " );
	    String lastName = keyboard.next();

        if ( lastName.compareTo("Carswell") <= 0 )
		{
			System.out.println(  "you don't have to wait long, \"" + lastName + "\"");   
        }
        else if ( lastName.compareTo("Jones") <= 0  )
		{
			System.out.println(  "that's not bad, \"" + lastName + "\"");   
        }
        else if ( lastName.compareTo("Smith") <= 0  )
		{
			System.out.println(  "you don't have to wait long, \"" + lastName + "\"");   
        }
        else if ( lastName.compareTo("Young") <= 0  )
		{
			System.out.println(  "it's gonna be a while, \"" + lastName + "\"");   
        }
		else if ( lastName.compareTo("Young") > 0  )
		{
			System.out.println(  "not going anywhere for a while? \"" + lastName + "\"");   
        }

        keyboard.close();
	}
}