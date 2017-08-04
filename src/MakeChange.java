import java.util.*;

public class MakeChange 
{
	Scanner kb = new Scanner(System.in);
	public static void main(String[] args) 
	{
		Scanner kb = new Scanner(System.in);
		double cashIn, amountDue, cashOut;
		int pennies = 0;
		
		System.out.println("How much is the item: ");
		amountDue = kb.nextDouble();
		
		
		getMoney(pennies);
		makeChange100(pennies);
		makeChange25(pennies);
		makeChange10(pennies);
		makeChange5(pennies);
		makeChange1(pennies);
	}


	public static double getMoney(int pennies) //This method gets money from the customer.
	{
		return -1.0;
	}
	
	public static double makeChange100(int pennies)//This method will break the amount given into dollars.
	
	{
		return -1.0;
	}
	
	public static double makeChange25(int pennies)//This method will break the amount down by quarters.
	{
		return -1.0;
	}
	
	public static double makeChange10(int pennies)//This method will break the amount down by dimes.
	{
		return -1.0;
	}
	
	public static double makeChange5(int pennies)//This method will break the amount down by nickels.
	{
		return -1.0;
	}
	
	public static double makeChange1(int pennies)//This method will break the amount down by pennies.
	{
		return -1.0;
	}
	
}