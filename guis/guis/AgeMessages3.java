package guis;
import java.util.Scanner;
public class AgeMessages3
{
    public static void main( String[] args )
    {

        Scanner scanner = new Scanner(System.in);

        System.out.print( "What's your name? " );   
        String name = scanner.next();

        System.out.println();
        System.out.print( "What's your age? " );  

        int age = scanner.nextInt();
        System.out.println();

        if ( age < 16 )
        {
            System.out.println(  "You can't drive, " +name );   
        }

        if ( age >= 16 && age < 18 )
        {
            System.out.println( "You can drive but not vote, " +name );
        }

        if ( age >= 18 && age < 25 )
        {
            System.out.println( "You can vote but not rent a car, " + name );
        }

        if ( age >= 25 )
        {
            System.out.println( "You can do pretty much anything, " +name );
        }

        scanner.close();
    }
}