//***************************************************************************
// author: Carter Schmidt    date: 9/4/2020
// purpose: Divide 2 numbers and output the result
//***************************************************************************

import java.util.Scanner;
public class Divider {

    public static void main(String[] args) {
    
    //declaring variables
    double dividend;
    double divisor;
    double quotient;
    
    //collecting inputs
    Scanner scan = new Scanner(System.in);
    System.out.println("Please enter the Dividend: ");
    dividend = scan.nextDouble();
    System.out.println("Please enter the Divisor: ");
    divisor = scan.nextDouble();
    
    //quotient equation
    quotient = (dividend / divisor);
    
    //printing output
    if (divisor == 0) {
        System.out.println("Zero cannot be the divisor.");
    }
    else 
        System.out.println("Division result is " + quotient);
    
    
    }
}