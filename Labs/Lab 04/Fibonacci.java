//****************************************************************************************************************************************
// author: Carter Schmidt date: 9/14/2020
// purpose: Print the first 15 Fibonacci numbers and print their average.
//****************************************************************************************************************************************
public class Fibonacci {
    public static void main(String[] args) {
        int a, b, c;
        float average, sum = 0;
        a = 1;
        b = 1;
        c = (a + b);
        //n is 15 and decreases by one for each repetition of the loop so the loop ends after printing 15 Fibonacci numbers
        int n = 15;
        System.out.println("The first 15 Fibonacci numbers are: ");
        //each new number is added to the previous numbers to create a sum of the 15 numbers, which is used for the average calculation
        while (n > 0) {
            System.out.print(a + " ");
            sum = sum + a;
            //these relationships create the Fibonacci sequence when repeated
            a = b;
            b = c;
            c = (a + b);
            n--;         
            }
         average = sum / 15;
         //print a space after the last number so the average appears on the next line
         System.out.println(" ");
         System.out.println("The average is " + average);   
    }
}