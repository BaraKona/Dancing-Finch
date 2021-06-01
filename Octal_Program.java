package dancing_finch;

import java.util.ArrayList;

public class Octal_Program {

	public static String Decimal_to_Octal_Program(String DecNum1) {

		//Make arrays
		ArrayList<Integer> Octal = new ArrayList<Integer>();
		ArrayList<Integer> OctRem = new ArrayList<Integer>();
		//String DecNum1 = Binary_Program.Decimal_to_Binary_Program();
		int DecNum = Integer.valueOf(DecNum1);
		int iii = 0;
		//Get mod of decimal number
		int Oct = (int)DecNum % 8;
		//Add the mod to DecBin ArrayList
		Octal.add(Oct);
		//Get remainder of decimal number after dividing by 2
		int RemOct = (int)DecNum / 8;
		//Add remainder to DecRem ArrayList
		OctRem.add(RemOct);
		while (RemOct > 0) {
			int Oct1 = RemOct % 8;
			Octal.add(Oct1);
			//DecRem.add(Rem); Mistake in design
			RemOct = OctRem.get(iii)/8;
			OctRem.add(RemOct); ++iii;
		} 
		//make Array numbers in String
		String Octal_num = new String(Octal.toString().replace("[","").replace("]","").replace(",", "").replace(" ", ""));
		//Flip binary number to be correct order
		StringBuilder Octal_Num = new StringBuilder();
		Octal_Num.append(Octal_num);
		Octal_Num = Octal_Num.reverse();
		System.out.println("Your octal equivalent is " + Octal_Num);
		
		return (Octal_Num + "");
	}

}