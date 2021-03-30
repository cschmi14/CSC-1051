import java.util.Scanner;

public class Input {

    public static void main (String[] args) {
    
        Scanner scan = new Scanner(System.in);

        // please write down your code below.
        int c = 0;
        do {
            System.out.println("Enter a positive integer which is divisible by 5: ");
            int n = scan.nextInt();
            if (n <= 0) {
                System.out.println("Not positive.");
            }
            if (n % 5 != 0) {
                System.out.println("Not divisible by 5.");
            }
            if ( (n > 0) && (n % 5 == 0)) {
                System.out.println("Qualified number.");
                c = 1;
            }
        } while (c != 1);
            
        
        
        
    }
}