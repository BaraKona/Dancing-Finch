package dancing_finch;
import java.util.ArrayList;
import java.util.Random;

public class Randomiser_Program {

	public static String Random_program() { //main(String[] args) { // Make new method
		
		boolean ProgramOn = true;
		//Make Array for randomised number
		ArrayList<String> RandomNum = new ArrayList<String>();
		
		// Generate random number between 0 and F and add to array. Do twice.
		Random randomNum = new Random(); 
		int i = 0;
		
		while (ProgramOn && i <= 1)
		{
			int  rnd = randomNum.nextInt(15) + 1;
			
			if (rnd == 10) 
			{
				RandomNum.add("A");  ++i;
			}
			else if (rnd == 11) 
			{
				RandomNum.add("B");  ++i;
			}
			else if (rnd == 12) 
			{
				RandomNum.add("C");  ++i;
			}
			else if (rnd == 13) 
			{
				RandomNum.add("D");  ++i;
			}
			else if (rnd == 14)  
			{
				RandomNum.add("E");  ++i;
			}
			else if (rnd == 15) 
			{
				RandomNum.add("F");  ++i;
			}
			else {
				RandomNum.add(String.valueOf(rnd));  ++i;
			}
		}
		//Assign Array to GenNum string
		String GenNum = new String(RandomNum.toString().replace("[","").replace("]","").replace(",", "").replace(" ", ""));
		System.out.println("Your hexadecimal number is " + GenNum);
		return GenNum;
	}

}
