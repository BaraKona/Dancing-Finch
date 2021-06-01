package dancing_finch;
import java.util.ArrayList;
public class Binary_Program {

	public static String Decimal_to_Binary_Program(String DecNum1) {
		
		//Make arrays
		ArrayList<Integer> DecBin = new ArrayList<Integer>();
		ArrayList<Integer> DecRem = new ArrayList<Integer>();
		//double Decnum = Decimal_Program.Hexadecimal_to_Decimal_Program();
		//Make DecNum into an integer.
		int DecNum = Integer.valueOf(DecNum1);
		int ii = 0;
		//Get mod of decimal number
		int Bin = DecNum % 2;
		//Add the mod to DecBin ArrayList
		DecBin.add(Bin);
		//Get remainder of decimal number after dividing by 2
		int Rem = DecNum / 2;
		//Add remainder to DecRem ArrayList
		DecRem.add(Rem);
		while (Rem > 0) {
			int Bin1 = Rem % 2;
			DecBin.add(Bin1);
			//DecRem.add(Rem); Mistake in design
			Rem = DecRem.get(ii)/2;
			DecRem.add(Rem); ++ii;
		} 
		//make Array numbers in String
		String Binary_number = new String(DecBin.toString().replace("[","").replace("]","").replace(",", "").replace(" ", ""));
		//Flip binary number to be correct order
		StringBuilder Binary_Number = new StringBuilder();
		Binary_Number.append(Binary_number);
		Binary_Number = Binary_Number.reverse();
		//make stringbuilder into string
		Binary_number = Binary_Number.toString();
		//Make double DecNum into string to return
		String BinaryNum = String.valueOf(DecNum);
		System.out.println("Your binary equivalent is " + Binary_number);
		return (Binary_number);
		
		
	}

}
