//*****************************************************************************************************
// author: Carter Schmidt date: 9/4/2020
// purpose: read 3 integers and output if the integers can represent a triangle and if so what kind
//*****************************************************************************************************

import java.util.Scanner;
public class TriangleTester {

    public static void main(String[] args) {
    
    //declaring variables
    int side1;
    int side2;
    int side3;
    
    //collecting inputs
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the first integer: ");
    side1 = scan.nextInt();
    System.out.println("Enter the second integer: ");
    side2 = scan.nextInt();
    System.out.println("Enter the third integer: ");
    side3 = scan.nextInt();
    
    //creating conditions for each type of triangle and printing the result
    if (side1 <= 0 || side2 <= 0 || side3 <= 0)
        System.out.println("Cannot represent a triangle.");
    else if ((side1 + side2 <= side3) || (side1 + side3 <= side2) || (side2 + side3 <= side1))
        System.out.println("Cannot represent a triangle.");
    else if (side1 == side2 && side2 == side3)
        System.out.println("Can represent an equilateral triangle.");
    else if ((Math.pow(side1, 2) + Math.pow(side2, 2)) == Math.pow(side3, 2) || (Math.pow(side1, 2) + Math.pow(side3, 2)) == Math.pow(side2, 2) || (Math.pow(side3, 2) + Math.pow(side2, 2)) == Math.pow(side1, 2))
        System.out.println("Can represent a right triangle.");
    else if ((side1 == side2 && side2 != side3) || (side1 == side3 && side1 != side2) || (side2 == side3 && side2 != side1))
        System.out.println("Can represent an isosceles triangle.");
    else if (side1 != side2 && side2 != side3 && side1 != side3)
        System.out.println("Can represent a scalene triangle.");
    
    }
}