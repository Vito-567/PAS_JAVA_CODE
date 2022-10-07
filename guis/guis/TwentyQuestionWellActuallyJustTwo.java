package guis;
import java.util.Scanner;

public class TwentyQuestionWellActuallyJustTwo 
{
    public static void main( String[] args )
    {

        Scanner scanner = new Scanner(System.in);

        System.out.println();

        System.out.println( "TWO QUESTIONS!" );  
        System.out.println( "Think of an object, and I'll try to guess it." );  
        System.out.println();

        System.out.println( "Question 1) Is it animal, vegetable, or mineral?" );  
        String type = scanner.next();
        if (type.equals("animal")) 
        {
            System.out.println( "Question 2) Is it bigger than a breadbox?" );  
            String size = scanner.next();
            if (size.equals("yes"))
            {
                System.out.println( "My guess is that you are thinking of a moose." );  
                System.out.println( "I would ask you if I'm right, but I don't actually care." );  
            }
            else
            {
                System.out.println( "My guess is that you are thinking of a squirl." );  
                System.out.println( "I would ask you if I'm right, but I don't actually care." );  
            }
        }
        System.out.println( "Question 1) Is it animal, vegetable, or mineral?" );  
        String type2 = scanner.next();
        if (type2.equals("vegetable")) 
        {
            System.out.println( "Question 2) Is it bigger than a breadbox?" );  
            String size = scanner.next();
            if (size.equals("yes"))
            {
                System.out.println( "My guess is that you are thinking of a watermelon." );  
                System.out.println( "I would ask you if I'm right, but I don't actually care." );  
            }
            else
            {
                System.out.println( "My guess is that you are thinking of a carrot." );  
                System.out.println( "I would ask you if I'm right, but I don't actually care." ); 
            }
        }
        System.out.println( "Question 1) Is it animal, vegetable, or mineral?" );  
        String type3 = scanner.next();
        if (type3.equals("mineral")) 
        {
            System.out.println( "Question 2) Is it bigger than a breadbox?" );  
            String size = scanner.next();
            if (size.equals("yes"))
            {
                System.out.println( "My guess is that you are thinking of a Camaro." );  
                System.out.println( "I would ask you if I'm right, but I don't actually care." );  
            }
            else
            {
                System.out.println( "My guess is that you are thinking of a paper clip." );  
                System.out.println( "I would ask you if I'm right, but I don't actually care." ); 
            }
        }
        scanner.close();
    }   
}