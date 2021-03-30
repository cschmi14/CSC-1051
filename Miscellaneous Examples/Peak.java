import java.util.Scanner;

public class Peak{

    public static void main(String[] args) {
    
        // collect three integers
        int num1;
        int num2;
        int num3;
        Scanner scan = new Scanner(System.in);
        System.out.println("list the first integer: ");
        num1 = scan.nextInt();
        System.out.println("list the second integer: ");
        num2 = scan.nextInt();
        System.out.println("list the third integer: ");
        num3 = scan.nextInt();

        
        // compare to confirm peak using conditionals
        if (num2 > num1)
            if (num2 < num3)
            System.out.println("There is a peak.");
        else
            System.out.println("There is no peak");
        
        
        // print the result
    }
}