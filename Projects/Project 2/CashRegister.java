//******************************************************************************************
// author: Carter Schmidt    date: 9/1/2020
// purpose: convert the total cents into a number of quarters, dimes, nickels, and pennies
//******************************************************************************************

//import scanner class
import java.util.Scanner;

public class CashRegister {

    public static void main(String[] args) {
    
    // declaring variables and constants
    int originalCents; // only used to print at the end to show the original amount in cents
    int cents; // variable that will decrease in the equations later on to calculate the required number of each coin
	 int quarters;
	 int dimes;
	 int nickels;
	 int pennies;
	 final int QUARTER_VALUE = 25;
	 final int DIME_VALUE = 10;
	 final int NICKEL_VALUE = 5;
	 final int PENNY_VALUE = 1;
    
    // creating Scanner object
    Scanner scan = new Scanner(System.in);
    
    // collecting inputs
    System.out.println("Enter an amount (in cents) : ");
    originalCents = scan.nextInt();
    cents = originalCents;
    
    // computing how many of each coin from the cents input
    quarters = cents / QUARTER_VALUE;
	 cents = cents - (quarters * QUARTER_VALUE);
	 dimes = cents / DIME_VALUE;
	 cents = cents - (dimes * DIME_VALUE);
	 nickels = cents / NICKEL_VALUE;
	 cents = cents - (nickels * NICKEL_VALUE);
	 pennies = cents / PENNY_VALUE;
    
    // outputting number of each coin
	 System.out.println(originalCents + " cents = ");
	 System.out.println("           " + quarters + " Quarters");
	 System.out.println("           " + dimes + " Dimes");
	 System.out.println("           " + nickels + " Nickels");
	 System.out.println("           " + pennies + " Pennies");
    
    }
}