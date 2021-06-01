package dancing_finch;
import java.util.ArrayList;
public class Decimal_Program {
	
	public static int Hexadecimal_to_Decimal_Program(String Hex) {
		//Make Arrays
		ArrayList<Integer> DecArr = new ArrayList<Integer>();
		//Call hexadecimal program
		//String Hex = Hexadecimal_Program.Hexadecimal();
		int i = 0;
		boolean ProgramOn = true; 
		//Reverse Hex into Hex1
		StringBuilder Hex1 = new StringBuilder();
		Hex1.append(Hex);
		Hex1 = Hex1.reverse();
		//initialise DecNum
		int DecNum = 0;
		//Convert Hexadecimal to decimal
		//program for 2 digit hexadecimal number
		if (Hex1.length() == 2) {
		while (ProgramOn && Hex1.length() == 2 && i < Hex1.length()) {
			 if (Hex1.charAt(i) == 'A') 
			 {
				 int A =(int) (10 * Math.pow(16, i)); ++i; DecArr.add(A);
			 }
			 else if (Hex1.charAt(i) == 'B') 
		     {
				 int B =(int) (11 * Math.pow(16, i)); ++i; DecArr.add(B);
			 }
		     else if (Hex1.charAt(i) == 'C') 
		     {
		    	 int C =(int) (12 * Math.pow(16, i)); ++i; DecArr.add(C);
			 }
		     else if (Hex1.charAt(i) == 'D') 
		     {
		    	 int D =(int) (13 * Math.pow(16, i)); ++i; DecArr.add(D);
			 }
		     else if (Hex1.charAt(i) == 'E') 
		     {
		    	 int E =(int) (14 * Math.pow(16, i)); ++i;DecArr.add(E);
			 }
		     else if (Hex1.charAt(i) == 'F') 
		     {
		    	 int F =(int) (15 * Math.pow(16, i)); ++i;DecArr.add(F);
			 }
		     else 
		     {
		    	 int Dec1 =Character.getNumericValue(Hex1.charAt(i));
		    	 DecArr.add((int)(Dec1 * Math.pow(16, i))); ++i;
		     }
			
		}
		//make decimal into DecNum
		DecNum = (int)DecArr.get(0) + (int)DecArr.get(1);
		}
		//Program for single digit Hexadecimal number
		else if (Hex1.length() == 1) {
			
				if (Hex1.charAt(0) == 'A') 
				 {
					 int A =(int) (10 * Math.pow(16, 0)); DecArr.add(A);
				 }
				 else if (Hex1.charAt(0) == 'B') 
			     {
					 int B =(int) (11 * Math.pow(16, 0)); DecArr.add(B);
				 }
			     else if (Hex1.charAt(0) == 'C') 
			     {
			    	 int C =(int) (12 * Math.pow(16, 0)); DecArr.add(C);
				 }
			     else if (Hex1.charAt(0) == 'D') 
			     {
			    	 int D =(int) (13 * Math.pow(16, 0)); DecArr.add(D);
				 }
			     else if (Hex1.charAt(0) == 'E') 
			     {
			    	 int E =(int) (14 * Math.pow(16, 0)); DecArr.add(E);
				 }
			     else if (Hex1.charAt(0) == 'F') 
			     {
			    	 int F =(int) (15 * Math.pow(16, 0));DecArr.add(F);
				 }
			     else 
			     {
			    	 int Dec1 =Character.getNumericValue(Hex1.charAt(0));
			    	 DecArr.add((int)(Dec1 * Math.pow(16, 0)));
			 } 
				//Make decimal into DecNum
				DecNum = (int)DecArr.get(0);
		}
		else {
			System.out.println("null");
		}
			System.out.println("Your decimal equivalent is " + DecNum);
			 return (DecNum);
			
			
		}
	
	
}




