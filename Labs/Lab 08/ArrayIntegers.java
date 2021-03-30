import java.util.Scanner;
public class ArrayIntegers {
    
    public static void main(String[] args) {
    
       Scanner scan = new Scanner(System.in);
       System.out.print("How many numbers > ");
       int n = scan.nextInt();
       int[] numbers = new int[n];
       
       for (int i = 0; i < n; i++) {
       
           System.out.print("Enter number > ");
           numbers[i] = scan.nextInt();
       
       }
       System.out.println();
   
       int sum = 0;
       for (int i = 0; i < n; i++) {
       
           sum += numbers[i];
       
       }
       
       int avg = sum / n;
       System.out.println("The average is " + avg);
       
       int count = 0;
       for (int x : numbers) {
       
           if (x < avg)
               count++;
       
       }
       
       System.out.println("Count less than average: " + count);
       
       count = 0;
       for (int x : numbers) {
       
           if (x == avg)
               count++;
       
       }
       
       System.out.println("Count equal to average: " + count);
       
       count = 0;
       for (int x : numbers) {
       
           if (x > avg)
               count++;
       
       }
       
       System.out.println("Count greater than average: " + count);

    }
}