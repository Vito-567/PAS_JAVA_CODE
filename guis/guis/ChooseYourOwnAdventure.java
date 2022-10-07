package guis;

import java.util.Scanner;

public class ChooseYourOwnAdventure 
{
    public static void main( String[] args )
    {

        Scanner scanner = new Scanner(System.in);

        System.out.println();

        System.out.println( "WELCOME TO MITCHELL'S TINY ADVENTURE!!" );  
        System.out.println();

        System.out.print( "You are in a creepy house!  Would you like to go \"upstairs\" or into the \"kitchen\"? " );  
        String where1 = scanner.next();
        if (where1.equals("kitchen")) 
        {
            System.out.println();
            System.out.println( "There is a long countertop with dirty dishes everywhere. Off to one side there is, as you'd expect, a refrigerator.");  
            System.out.print( "You may open the \"refrigerator\" or look in a \"cabinet\". ");  
            String what1 = scanner.next();
            if (what1.equals("refrigerator"))
            {
                System.out.println();
                System.out.println( "Inside the refrigerator you see food and stuff.  It looks pretty nasty." );  
                System.out.print( "Would you like to eat some of the food? (\"yes\" or \"no\") " );
                String yesorno = scanner.next(); 
                if (yesorno.equals("yes"))
                {
                    System.out.println();
                    System.out.println( "You die of violent food poisoning instantly." );
                }  
                else 
                {
                    System.out.println();
                    System.out.println( "You die of starvation... eventually." );  
                }
            }
            else
            {
                System.out.println();
                System.out.println( "Inside the dirty cabinet there is a handgun with some ammmo. It looks brand new." );  
                System.out.print( "Would you like to take the handgun and load the ammo? " );  
                String yesorno = scanner.next();
                if (yesorno.equals("yes"))
                {
                    System.out.println();
                    System.out.println( "That was an Beretta M9 pistol that uses 9mm NATO rounds. However, you're too stupid to read so you added 10mm rounds. The pistol exploded, killing you instantly." );
                }  
                else 
                {
                    System.out.println();
                    System.out.println( "A monster suddently appeared in front of you, you have nothing to defend yourself and was defenestrated. You fell to your death." );  
                }
            }
        }
        else if (where1.equals("upstairs")) 
        {
            System.out.println();
            System.out.println( "Upstairs you see a hallway.  At the end of the hallway is the master \"bedroom\".  There is also a \"bathroom\" off the hallway. efrigerator.");  
            System.out.print( "Where would you like to go? ");  
            String what3 = scanner.next();
            if (what3.equals("bedroom"))
            {
                System.out.println();
                System.out.println( "You are in a plush bedroom, with expensive-looking hardwood furniture. The bed is unmade.  In the back of the room, the closet door is ajar.  " );  
                System.out.print( "Would you like to open the closet? (\"yes\" or \"no\") " );
                String yesorno = scanner.next(); 
                if (yesorno.equals("yes"))
                {
                    System.out.println();
                    System.out.println( "It was a trap trigger. A hidden trapdoor opened below you. You fell into a pit of legos. You died to legos." );
                }  
                else 
                {
                    System.out.println();
                    System.out.println( "You accidentally tripped over some left over cheetos and broke your favorite watch. You soon died to depression." );  
                }
            }
            else
                {
                    System.out.println( "Inside the bathroom, there is a emergency call handler with a wire going into the wall" );  
                    System.out.print( "Would you like to use it to call for help? " );  
                    String yesorno = scanner.next();
                    if (yesorno.equals("yes"))
                    {
                        System.out.println();
                        System.out.println( "Because of the bad pipe and wire management, you were electrocuted to death. " );
                    }  
                    else 
                    {
                        System.out.println();
                        System.out.println( "The bathroom door suddently closed and locked on you. You then later died due to death. " );  
                    }
                }
        }

        scanner.close();
    }   
}