import java.util.*;

public class MakeChange 
{
	Scanner kb = new Scanner(System.in);
	private static Scanner kb2;
	public static void main(String[] args) 
	{
		kb2 = new Scanner(System.in);
		double cashIn, amountDue, cashOut, penniesR;
		int pennies = 0, penniesT, quarters, dimes, nickels, dollars, fiveDollars, tenDollars, twentyDollars;
		
		System.out.print("How much is the item: $");
		amountDue = kb2.nextDouble();
		System.out.print("How much money was tendered? $");
		cashIn = kb2.nextDouble();
		
		if(cashIn < amountDue)
		{
			System.err.println("Customer has not provided enough funds!");
		}
		
		
		cashOut = cashIn - amountDue;
		penniesR = Math.round(cashOut*100.00)/100.00;
		//System.out.println(penniesR);						//check to ensure that math is correct
		
		System.out.println("Customer's change $" + penniesR);
		
		
	
		pennies = (int)Math.round(cashOut * 100);
		//System.out.println(pennies);						//check to ensure that math is correct
		
		twentyDollars = pennies/2000;
		pennies %= 2000;
		tenDollars = pennies/1000;
		pennies %= 1000;
		fiveDollars = pennies/500;
		pennies %= 500;
		dollars = pennies/100;
		pennies %= 100;		
		quarters = pennies/25;
		pennies %= 25;
		dimes = pennies/10;
		pennies %= 10;
		nickels = pennies/5;
		pennies %= 5;
		penniesT = pennies/1;
		pennies %= 1;
		
		System.out.println("Customer's change by denomination: ");
		System.out.println("Twenties: " + twentyDollars);
		System.out.println("Tens: " + tenDollars);
		System.out.println("Fives: " + fiveDollars);
		System.out.println("Ones: " + dollars);
		System.out.println("Quarters : " + quarters);
		System.out.println("Dimes : " + dimes);
		System.out.println("Nickels : " + nickels);
		System.out.println("Pennies : " + penniesT);
	}
	
}