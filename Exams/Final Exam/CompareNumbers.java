//*****************************
// 2. Conditional Operator
// Author: Carter Schmidt
//
//*****************************
import java.util.Scanner;
public class CompareNumbers {

    public static void main(String[] args) {
   
        // step 1. 
        // plese collect two integers and assign them to n1 and n2.

        Scanner scan = new Scanner(System.in);
        System.out.println("input two integers: ");
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        
        
        // step 2.
        // rewrite the below if-else to conditional operator
        System.out.println((n1 > n2) ? (n1 + " is greater than " + n2) : (n1 + " is not greater than " + n2));
   
   
             
    }
}