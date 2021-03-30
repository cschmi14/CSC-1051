//***********************************************************************************************
// author: Carter Schmidt date: 9/14/2020
// purpose: create a triangle shape with height n where n is less than 10.
//***********************************************************************************************
import java.util.Scanner;
public class ReDrawing {
    public static void main(String[] args) {
        //creating scanner object
        Scanner scan = new Scanner(System.in);
        // declaring variables: n = input, c is the number of repetitions for the loop
        //l is used to increment the numbers added on each side of the previously printed number
        //x is used to control the number of loop repetitions to print the correct number of spaces to create a triangle
        //str is the first number in the middle of the triangle and is the variable that creates each following line
        int n;
        int l;
        int x;
        String str = "1";
        //repeats until 5 valid inputs are collected and made into triangles
        for (int c = 5; c > 0; c--) {
            //do loop for input validation
            do {
               System.out.println("Input an integer (less than 10): ");
               n = scan.nextInt();
               //l, x, and str must be reset on each input so the loop creates an appropriate triangle every time
               l = 0;
               x = n;
               str = "1";
               //two illegal conditions, prints appropriate message for why input is illegal
               if (n >= 10) {
                   System.out.println("Input should less than 10.");
                   }
               else if (n <= 0) {
                   System.out.println("Input should be positive.");
                }
            } while (n <= 0 || n >= 10);
            //these loops create the triangle when the input is legal
            for  (x = n; n > 0; n--, l++)  {
                //adds increasing number on each side of the initial string "1" starting after str is printed once
                if (l > 0) {
                    str = ((l + 1) + str + (l + 1));
                }
                //prints (n-1) spaces before each line to create triangle structure
                for (x = n; x > 1; x--) {
                    System.out.print(" ");
                }
                System.out.println(str);
            }
        }
        System.out.println("Finish Drawing");
    }
}