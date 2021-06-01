package dancing_finch;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import com.birdbraintechnologies.Finch;
import edu.cmu.ri.createlab.terk.robot.finch.Finch;
public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		//call finch
		Finch myFinch = new Finch();
		//Make Array for all hexadecimal inputs.
		ArrayList<String> FHexArr = new ArrayList<String>();
		//make array for sorting program
		String SChoice = "y";
	for (SChoice.equals("y"); SChoice.equals("y"); SChoice.equals("y")) {
		//Reading the hex
		String Hexadecimal = Hexadecimal_Program.Hexadecimal();
		
		//input the different coversion programs
		int Decimal = Decimal_Program.Hexadecimal_to_Decimal_Program(Hexadecimal);
		String Octal_Num = Octal_Program.Decimal_to_Octal_Program(Decimal + "");
		String BinaryNum = Binary_Program.Decimal_to_Binary_Program(Decimal + "");
		
		//Set LED
		int Red = (int) Decimal;
		int Green = 3 * (Red % 80);
		int Blue;
		if (Red > Green) {
			Blue = Red;
		}
		else {
			Blue = Green;
		}
		System.out.println("LED is set to (" + Red + "," + Green + "," + Blue +  ")");
		//Set Finch Speed
		//Convert Octal_Num string into integer Speed.
		int spd = Integer.parseInt(Octal_Num);
			if (spd > 255) {
				spd = 255;
			}
			else if (spd < 60){
				spd = spd + 50;
			}
			
		//Output everything;
		System.out.println(Hexadecimal + ", " + Decimal + ", " + Octal_Num + ", " + BinaryNum + ", Speed = " + spd  + ", " 
		+  "LED Colour(Red: " + Red + ", Green: " + Green +", Blue: " + Blue + ")" );
		//--- Set LED ------------------------------------------------------------------------------------------------------------------------------------------
		myFinch.setLED(Red, Green, Blue);
	//-----//Dance -----------------------------------------------------------------------------------------------------------------------------------------
	int i = 0;
	if (Hexadecimal.length() == 1) {
		while (Hexadecimal.length() == 1 && i < BinaryNum.length()) {
		 if (BinaryNum.charAt(i) == '1') {
			 myFinch.setWheelVelocities(spd, spd, 1000); myFinch.sleep(100);++i;
		 }
		 else {
			 myFinch.setWheelVelocities(-spd, -spd, 1000);myFinch.sleep(100); ++i;
		 }
		 
		}
	}
	else if(Hexadecimal.length() == 2) {
		while (Hexadecimal.length() == 2 && i < BinaryNum.length()) {
			 if (BinaryNum.charAt(i) == '1') {
				 myFinch.setWheelVelocities(spd, spd, 500); myFinch.sleep(100);++i;
				 
			 }
			 else {
				 myFinch.setWheelVelocities(-spd, -spd, 500);myFinch.sleep(100); ++i;
				
			 }
			 
			}
	}
	else {
		System.out.println("Error");
	}
	 System.out.println("Would you like to another hex number? (y/n)");
	 Scanner Choice = new Scanner(System.in);
	 SChoice = Choice.nextLine();
	 //Add hexa to arraylist
	 FHexArr.add(Hexadecimal);
	 if (SChoice.contentEquals("n")) {
		 //Sort arraylist
		 Collections.sort(FHexArr);
		 //print arraylist
		 System.out.println(FHexArr);
	 }
	 
	 File HexFile = new File("textFile.txt");
	 PrintWriter textFile = new PrintWriter(HexFile);
	 ((PrintWriter) textFile).println(FHexArr);
	 textFile.close();
    }
	
}
}

