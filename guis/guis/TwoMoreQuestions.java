package guis;
import java.util.Scanner;
public class TwoMoreQuestions
{
    public static void main( String[] args )
    {

        Scanner scanner = new Scanner(System.in);

        System.out.print( "TWO MORE QUESTIONS, BABY!" );   

        System.out.println();
        System.out.print( "Think of something and I'll try to guess it!" );  

        System.out.print( "Question 1) Does it stay inside or outside or both? " ); 
        String where = scanner.next();

        System.out.println();

        System.out.print( "Question 2) Is it a living thing? " ); 
        String living = scanner.next();

        System.out.println();

        if ( where.equals("inside") && living.equals("yes") )
        {
            System.out.println(  "Then what else could you be thinking of besides a houseplant?!?" );   
        }
        if ( where.equals("inside") && living.equals("no") )
        {
            System.out.println(  "Then what else could you be thinking of besides a curtain?!?" );   
        }
        if ( where.equals("outside") && living.equals("yes") )
        {
            System.out.println(  "Then what else could you be thinking of besides a bison?!?" );   
        }
        if ( where.equals("outside") && living.equals("no") )
        {
            System.out.println(  "Then what else could you be thinking of besides a billboard?!?" );   
        }
        if ( where.equals("both") && living.equals("yes") )
        {
            System.out.println(  "Then what else could you be thinking of besides a dog?!?" );   
        }
        if ( where.equals("both") && living.equals("no") )
        {
            System.out.println(  "Then what else could you be thinking of besides a phone?!?" );   
        }

        scanner.close();
    }
}