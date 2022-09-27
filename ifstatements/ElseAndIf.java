package ifstatement;

public class ElseAndIf
{
	public static void main( String[] args )
	{
		int people = 30;
		int cars = 40;
		int buses = 15;

		if ( cars > people ) //condition A
        {
			System.out.println( "We should take the cars." );
        }
		else if ( cars < people ) //if condition A is not true, else if will run, but the else if condition is true, it will run the statement inside. 
        {
            System.out.println( "We should not take the cars." );
        }
        else //if neither conditions are true, the else will run. 
        {    //if this else is removed and neither conditions are true, nothing will happen. 
            System.out.println( "We can't decide." );
        }
        

		if ( buses > cars )
		{
			System.out.println( "That's too many buses." );
		}
		else if ( buses < cars )
		{
			System.out.println( "Maybe we could take the buses." );
		}
		else
		{
			System.out.println( "We still can't decide." );
		}


		if ( people > buses ) //condition B
		{
			System.out.println( "All right, let's just take the buses." );
		}
		else //If the if condition B is not true, the else statement will run. 
		{
			System.out.println( "Fine, let's stay home then." );
		}

	}
}