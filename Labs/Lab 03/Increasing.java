//***************************************************************************
// author: Carter Schmidt    date: 9/4/2020
// purpose: Determine if 3 integers are in increasing order or not
//***************************************************************************
import java.util.Scanner;
public class Increasing {

    public static void main(String[] args) {
    
    //declaring variables
    int num1;
    int num2;
    int num3;
    
    //collecting inputs
    Scanner scan = new Scanner(System.in);
    System.out.println("Please enter an integer: ");
    num1 = scan.nextInt();
    System.out.println("Please enter an integer: ");
    num2 = scan.nextInt();
    System.out.println("Please enter an integer: ");
    num3 = scan.nextInt();
    
    //Determining if integers are increasing or not
    
    if (num1 < num2) {
        if (num2 < num3) {
        System.out.println("The numbers " + num1 + " " + num2 + " " + num3 + " are strictly increasing.");
        }
    }
    else
        System.out.println("The numbers " + num1 + " " + num2 + " " + num3 + " are not strictly increasing.");
           
    }
}