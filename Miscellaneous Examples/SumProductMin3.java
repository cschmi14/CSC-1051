import java.util.Scanner;

public class SumProductMin3{

    public static void main(String[] args) {
    
        // collect three numbers
        Scanner scan = new Scanner(System.in);
        System.out.println("Input the 1st number: ");
        double a = scan.nextDouble();
        System.out.println("Input the 2st number: ");
        double b = scan.nextDouble();
        System.out.println("Input the 3st number: ");
        double c = scan.nextDouble();
        
        // calculate sum
        double sum = a + b + c;
        System.out.println("The sum is: " + sum);
        // calculate product
        double product = a * b * c;
        System.out.println("The product is: " + product);
        // compare to calculate min
        if (a < b & a < c)
            System.out.println("The min is: " + a);
        else if (a < b & a > c)
            System.out.println("The min is: " + c);
        else
            System.out.println("The min is: " + b);
        
        // print the result
    }
}