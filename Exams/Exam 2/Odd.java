import java.util.Scanner;

public class Odd {

    public static void main (String[] args) {
    
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter an integer: ");
        int n = scan.nextInt();               
        /*
        if ( n % 2 != 0) {
            System.out.println("Is odd number.");
        } else {
            System.out.println("Is even number.");
        }*/
        
        // Please comment the above if statements and rewrite it using Conditional operator.
        // Your code starts from here:
        
        System.out.println( (n % 2 != 0) ? "Is odd number." : "Is even number.");
        
    }
}