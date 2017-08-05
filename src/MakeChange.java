import java.util.*;

public class MakeChange 
{
	Scanner kb = new Scanner(System.in);
	private static Scanner kb2;
	public static void main(String[] args) 
	{
		kb2 = new Scanner(System.in);
		double cashIn, amountDue, cashOut, penniesR;
		int pennies = 0, penniesT, quarters, dimes, nickels;
		
		System.out.print("How much is the item: $");
		amountDue = kb2.nextFloat();
		System.out.print("How much money was tendered? $");
		cashIn = kb2.nextFloat();
		
		cashOut = cashIn - amountDue;
		
		System.out.println("$" + cashOut);
		
		penniesR = Math.round(cashOut*100.00)/100.00;
		System.out.println(penniesR);
		
		pennies = (int)Math.round(cashOut * 100);
		System.out.println(pennies);
		
		quarters = pennies/25;
		pennies %= 25;
		dimes = pennies/10;
		pennies %= 10;
		nickels = pennies/5;
		pennies %= 5;
		penniesT = pennies/1;
		pennies %= 1;
		
		System.out.println("Quarters : " + quarters + " Dimes : " + dimes +
				" Nickels : " + nickels + " Pennies : " + penniesT);
	}
	
}