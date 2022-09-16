public class NumbersAndMaths
{
	public static void main( String[] args )
	{   // This line puts a text message showing what will be done
		System.out.println( "I will now count my chickens:" );
        //These lines show the numbers of each lifestocks
		System.out.println( "Hens " + ( 25 + 30 / 6 ) );
		System.out.println( "Roosters " + ( 100 - 25 * 3 % 4 ) );
        //This line show what they will be doing
		System.out.println( "Now I will count the eggs:" );
        //This line calculates the numbers below and shows the answer
		System.out.println( 3 + 2 + 1 - 5 + 4 % 2 - 1 / 4 + 6 );
        //This line is trying to find out if 3 + 2 < 5 - 7 using the code
		System.out.println( "Is it true that 3 + 2 < 5 - 7?" );
        //This line announces wether if the expression is true or not
		System.out.println( 3 + 2 < 5 - 7 );
        //These lines have a text on each of them with the answers on the end 
		System.out.println( "What is 3 + 2? " + ( 3 + 2 ) );
		System.out.println( "What is 5 - 7? " + ( 5 - 7 ) );
        //This is a simple text message
		System.out.println( "Oh, that's why it's false." );
        //This is also a simple message
		System.out.println( "How about some more." );
        //These lines have a text on each of them with the answers on the end 
		System.out.println( "Is it greater? " + ( 5 > -2 ) );
		System.out.println( "Is it greater or equal? " + ( 5 >= -2 ) );
		System.out.println( "Is it less or equal? " + ( 5 <= -2 ) );
	}
}