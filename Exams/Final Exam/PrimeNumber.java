//*****************************
// 4. loop & condition (advanced)
// Author: Carter Schmidt
//
//*****************************
import java.util.Scanner;
public class PrimeNumber {

    public static void main(String[] args) {
   
        // your code starts from here.
        
        Scanner scan = new Scanner(System.in);
        System.out.println("input an integer greater than 1: ");
        int n = scan.nextInt();
        int factors = 0;
        
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                factors++;
            }
        }
        
        if (factors != 2) {
            System.out.println("It's not a prime number.");
        }
        else if (factors == 2) {
            System.out.println("It's a prime number.");
        }
        
    }
}