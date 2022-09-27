import java.util.Scanner;

public class MoreUserInputOfData {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		int grade, age;
		String firstName, lastName, logIn, confirmScam, studentID, email, emailPassword, bankAccount,
				bankAccountPassword, estimatedYearlyIncome, adress;
		double GPA, height, weight;

		System.out.println("Please give me your personal info so I can scam you");

		System.out.print("Your first name: ");
		firstName = keyboard.next();

		System.out.print("Your last name: ");
		lastName = keyboard.next();

		System.out.print("Age: ");
		age = keyboard.nextInt();

		System.out.print("Grade: ");
		grade = keyboard.nextInt();

		System.out.print("Student ID: ");
		studentID = keyboard.next();

		System.out.print("Login: ");
		logIn = keyboard.next();

		System.out.print("GPA: ");
		GPA = keyboard.nextDouble();

		System.out.print("Height (cm): ");
		height = keyboard.nextDouble();

		System.out.print("Weight (kg): ");
		weight = keyboard.nextDouble();

		System.out.print("E-mail: ");
		email = keyboard.next();

		System.out.print("Email password: ");
		emailPassword = keyboard.next();

		System.out.print("Bank account: ");
		bankAccount = keyboard.next();

		System.out.print("Bank account password: ");
		bankAccountPassword = keyboard.next();

		System.out.print("Estimated yearly income (usd): ");
		estimatedYearlyIncome = keyboard.next();

		System.out.print("Home adress: ");
		adress = keyboard.next();

		System.out.print("Type something if you are willing to be scammed. ");
		confirmScam = keyboard.next();

		System.out.println("Your info is sold on the dark web for 69.420 USD:");
		System.out.println("===========================================================");
		System.out.println("║ Name: " + firstName + ", " + lastName + "                                              ");
		System.out.println("║ Age: " + age + "                                                  ");
		System.out.println("║ ID: " + studentID + "                                                   ");
		System.out.println("║ Login " + logIn + "                                                 ");
		System.out.println("║ Grade: " + grade + "                                                ");
		System.out.println("║ GPA: " + GPA + "                                                ");
		System.out.println("║ Height: " + height + " cm                                          ");
		System.out.println("║ Weight: " + weight + "kg                                           ");
		System.out.println("║ E-mail: " + email + "                                               ");
		System.out.println("║ E-mail password: " + emailPassword + "                                      ");
		System.out.println("║ Estimated yearly income: " + estimatedYearlyIncome + "                              ");
		System.out.println("║ Bank account: " + bankAccount + "                                         ");
		System.out.println("║ Bank account password: " + bankAccountPassword + "                                ");
		System.out.println("║ Home adress: " + adress + "                                          ");
		System.out.println("║ btw" + confirmScam + "");
		System.out.println("===========================================================");

		keyboard.close();
	}
}