package guis;

public class CompareToChallenge 
{   
    public static void main( String[] args )
    {
        System.out.print("Comparing \"axe\" with \"dog\" produces ");
        int i = "axe".compareTo("dog");
        System.out.println(i);

        System.out.print("Comparing \"applebee's\" with \"apple\" produces ");
        System.out.println( "applebee's".compareTo("apple") );
    }
}