package dancing_finch;
import java.util.ArrayList;
import java.util.Scanner;

public class Hexadecimal_Program {

	public static String Hexadecimal() {
		
		boolean ProgramOn = true;
		//Make ArrayList for Hexadecimal number 
		ArrayList<String> HexArr = new ArrayList<String>();
		//Make ArrayList for final hexadecimal display (Requirement)
		
		
		
		//Output Brief of program
		System.out.println("This is the dance program. Where you input a hexadecimal number and the "
				+ "robot will make a dance from it by converting into different number systems.");
		//Q1
		System.out.println("If you wish to continue write (y) if not, write (n)"); 
		
		//Take user input
		 Scanner Choice = new Scanner(System.in);
		 String SChoice = Choice.nextLine();
		 
		//Check user input Q1, if yes continue else Stop program. 
		 while (ProgramOn) 
		 {
			 if (SChoice.equals("y") || SChoice.equals("Y") || SChoice.contentEquals("yes")) 
			 {
				//Q2
				 System.out.println("Would you like to use a randomised dance routine? (y/n)"); 
				 ProgramOn = false;
			 }
			 else if (SChoice.equals("n") || SChoice.equals("N") || SChoice.contentEquals("no")) 
			 {
				 return null;
			 }
			 else
			 { 
				 return null;
			 }
		 }
		 String SChoice12 = Choice.nextLine();
		//Check user input Q2, if yes continue else Stop program.
		 ProgramOn = true;
		 while (ProgramOn) 
		 {
			 if (SChoice12.equals("y") || SChoice12.equals("Y") || SChoice12.contentEquals("yes")) 
			 {
				String GenNum = Randomiser_Program.Random_program();
				String Hex = new String(GenNum);
				int randomGen = 1;
				 return Hex;
				 
			 }
			 else if (SChoice12.equals("n") || SChoice12.equals("N") || SChoice12.contentEquals("no")) 
			 {
				//Q3
				 System.out.println("Please enter a hexadecimal number of your choice. (Must be 1 or 2 digits)");
				 ProgramOn = false;
			 }
			 else
			 { 
				 return null;
			 }
		 }
		//Check user input Q3 and assign value to Hex
		 String Input = Choice.nextLine();
		 String Hex = new String(Input);
		ProgramOn = true;
		int i = 0;
		 while (ProgramOn && i == 0 && Hex.length() <= 2) 
			 {
			
				 //Q4
				 System.out.println("The hexadecimal number you wrote was " + Hex + ". Would you like to change it? (y/n)");
				// Check user input Q4.
				 String SChoice1 = Choice.nextLine();
					//Check user input Q2, if yes continue else Stop program.
				 if (SChoice1.equals("y") || SChoice1.equals("Y") || SChoice1.contentEquals("yes")) 
				 {
					 ProgramOn = true; i = 0;
				 }
				 else if (SChoice1.equals("n") || SChoice1.equals("N") || SChoice1.contentEquals("no")) 
				 {
					
					 System.out.println("Your Hexadecimal number is " + Hex);
					 ProgramOn = false; ++i; 
					//Add Hexadecimal numbers to Arrays
					 HexArr.add(Hex);
					 return Hex; 
				 }
				 else
				 { 
					 return null;
				 }
			 }
		 return Hex;
	}
}
