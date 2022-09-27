package ifstatement;
public class WhatIf
{
	public static void main( String[] args )
	{
		int people = 20;
		int cats = 20;
		int dogs = 15;
		
		//the if expression will determine wether the expression is true and will execute the code according to the value of the variables. 
		if ( people < cats )
		{
			System.out.println( "Too many cats!  The world is doomed!" );
		}

		if ( people > cats )
		{ 	
			//The curley braces groups the statements within them. If the condition is true, the code will be executed. 
			System.out.println( "Not many cats!  The world is saved!" );
		}

		if ( people < dogs )
		{
			System.out.println( "The world is drooled on!" );
		}

		if ( people > dogs )
		{
			System.out.println( "The world is dry!" );
		}

		dogs += 5;

		if ( people >= dogs )
		{
			System.out.println( "People are greater than or equal to dogs." );
		}

		if ( people <= dogs )
		{
			System.out.println( "People are less than or equal to dogs." );
		}

		if ( people == dogs )
		{
			System.out.println( "People are dogs." );
		}
	}
}