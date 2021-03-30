//****************************************************************************************************************************
// author: Carter Schmidt date: 9/14/2020
// purpose: Compute PI using the Leibniz formula and print how many terms are required to be within a given tolerance of pi.
//****************************************************************************************************************************
import java.util.Scanner;
public class ComputePI {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the tolerance value: ");
        double tolerance = scan.nextDouble();
        
        //checking for illegal condition when tolerance is negative
        if (tolerance < 0) {
            System.out.println("Tolerance should be positive.");
            return;
            }
            
        //pi is 1 to be the first term in Leibniz formula, and it is equal to 1/4 the estimate of pi
        //n is 3 because the second term in the Leibniz formula is -1/3
        double pi = 1, n = 3;
        
        //x is used to alternate between addition and subtraction for each new term in the Leibniz formula
        //c is zero until the pi estimate is within the tolerance of PI, in which case c becomes 1 and the loop terminates
        //i is the number of terms, and is equal to 1 since the loop starts with one term from the Leibniz formula, and i increases for each repetition of the loop
        int x = -1, i = 1, c = 0;
        
        //adds a new term in Leibniz formula each repetition of the loop, and it loops until the PI estimate is within the tolerance of PI
        while (c == 0) {
            pi = (pi - (1 / n));
            n = ((Math.abs(n) + 2) * (x));
            i++;
            x = (x * -1);
            if (((Math.PI - tolerance) < (4 * pi)) && ((4 * pi) < (Math.PI + tolerance))) {
                c = 1;
            }
        }
        
        System.out.println("The number of terms is " + i);
        System.out.println("The estimate PI is " + (4 * pi));
        
    }
}