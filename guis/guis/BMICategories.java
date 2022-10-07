package guis;

import java.util.Scanner;
public class BMICategories
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		double weight, height;

		System.out.print( "What is your height in meters? " );
		height = keyboard.nextDouble();

		System.out.print( "What is your weight in kg? " );
		weight = keyboard.nextDouble();

        Double bmi = weight / (height * height);

		System.out.println( "Your BMI is " + bmi);

        if ( bmi < 18.5 )
		{
			System.out.println(  "BIM Category: underweight");   
        }
        else if ( bmi < 25.0 )
		{
			System.out.println( "BIM Category: normal weight ");
        }
        else if ( bmi < 30.0 )
		{
			System.out.println( "BIM Category: overweight ");
        }
        else
		{
			System.out.println( "BMI Category: obese" );
        }

        keyboard.close();
	}
}