package dancing_finch;
import java.util.Scanner;
import java.util.ArrayList;
import com.birdbraintechnologies.Finch;
public class Repeat_Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//call finch
		Finch myFinch = new Finch();
		//Make Array for all hexadecimal inputs.
		ArrayList<String> FHexArr = new ArrayList<String>();
		//make array for sorting program
		ArrayList<Integer> DecSort = new ArrayList<Integer>();
		//Set condition for program to repeat
		String SChoice = "y";
	for (SChoice.equals("y"); SChoice.equals("y"); SChoice.equals("y")) {
		//Reading the hex
		String Hexadecimal = Hexadecimal_Program.Hexadecimal();
		
		//int DecNum = Decimal_Program.DecNum;
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
	 //Add hexa to array and decimal to arr
	 DecSort.add(Decimal);
	 FHexArr.add(Hexadecimal);
	 
	 //Bubble sort
	/* boolean sorted = false;

	    while (!sorted) {
	        sorted = true;
	        for (i = 0; i < DecSort.size()-1; i++) {
	            if (DecSort.get(i).compareTo(DecSort.get(i + 1)) > 0) {
	                int temp = DecSort.get(i);
	                DecSort.set(i, DecSort.get(i + 1));
	                DecSort.set(i + 1, temp);
	                sorted = false;
				 
			 } 
	}
	    }
}
		
} */
	/*void bubbleSort(int arr[]) 
    { 
        int n = arr.length; 
        for (int i = 0; i < n-1; i++) 
            for (int j = 0; j < n-i-1; j++) 
                if (arr[j] > arr[j+1]) 
                { 
                    // swap arr[j+1] and arr[i] 
                    int temp = arr[j]; 
                    arr[j] = arr[j+1]; 
                    arr[j+1] = temp; 
                } */
    }
	
}
}

