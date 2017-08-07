import java.util.*;

/**
 * @author samuelryzek
 *
 */

public class MakeChange 
{
	private static Scanner kb;		//initializes Scanner in field
	public static void main(String[] args) 
	{
		kb = new Scanner(System.in);  //calls scanner and initializes
		double cashIn, amountDue, cashOut, penniesR; // identifies doubles to be used in program
		int pennies = 0, penniesT, quarters, dimes, nickels, dollars, fiveD, tenD, twentyD;  //identifies ints to be used in program
		
		
		
		System.out.print("How much is the item: $"); //asks user for the cost of the item
		amountDue = kb.nextDouble(); //user inputs cost of item
		System.out.print("How much money was received from customer? $"); //asks user for funds collected
		cashIn = kb.nextDouble(); //user inputs funds collected
		
			if (cashIn < amountDue)  //if loop prints error if the amount of funds received is less than the amount due.
			{
				System.err.println("Customer has not provided enough funds!"); //error prints if applicable
				
			}
			else
			{
		
				cashOut = cashIn - amountDue;  //computes the amount of cash the customer should receive back
				penniesR = Math.round(cashOut*100.00)/100.00; //converts the amount due to customer to pennies and rounds to two decimal places
				//System.out.println(penniesR);						//check to ensure that program displays correctly
				
				System.out.println(" "); //presentation formatting
				System.out.println("Customer's change: $" + penniesR); //tells user the amount of change due to the customer as dollars and cents.
				System.out.println(" "); //presentation formatting
				
			
				pennies = (int)Math.round(cashOut * 100); //takes the change due to the customer and converts it to an whole number value
				//System.out.println(pennies);						//check to ensure that math is correct and displays correctly
				
				//the following series checks the total amount due to the customer and begins to break the change down by denomination
				twentyD = pennies/2000; 		//takes the number of pennies and divides it by 2000 to get the number of twenties and result is stored
				pennies %= 2000;				//find the remaining amount of pennies and passes the value
				
				tenD = pennies/1000;			//takes the remaining pennies and determines the number of tens
				pennies %= 1000;				//determines the amount of remaining pennies
				
				fiveD = pennies/500;			//takes the remaining pennies and determines the number of fives
				pennies %= 500;				//determines the amount of remaining pennies
				
				dollars = pennies/100;		//takes the remaining pennies and determines the number of ones
				pennies %= 100;				//determines the amount of remaining pennies
				
				quarters = pennies/25;		//takes the remaining pennies and determines the number of quarters
				pennies %= 25;				//determines the amount of remaining pennies
				
				dimes = pennies/10;			//takes the remaining pennies and determines the number of dimes
				pennies %= 10;				//determines the amount of remaining pennies
				
				nickels = pennies/5;			//takes the remaining pennies and determines the number of nickels	
				pennies %= 5;				//determines the amount of remaining pennies
				
				penniesT = pennies/1;		//takes the remaining pennies and counts them
					
				//the rest of the program prints the results to the user and breaks the results down by denomination
				System.out.println("***********************************");
				System.out.println("Customer's change by denomination: ");
				System.out.println("Twenties: " + twentyD);
				System.out.println("Tens: " + tenD);
				System.out.println("Fives: " + fiveD);
				System.out.println("Ones: " + dollars);
				System.out.println("Quarters : " + quarters);
				System.out.println("Dimes : " + dimes);
				System.out.println("Nickels : " + nickels);
				System.out.println("Pennies : " + penniesT);
				System.out.println("***********************************");
			}
	}
	
}
//Final
