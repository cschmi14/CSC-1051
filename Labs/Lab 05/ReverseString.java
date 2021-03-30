//***************************************************************************************************************************
// Author: Carter Schmidt  Date: 9/23/2020
// Purpose: Read a string, filter out non-letter characters, print its first/last letter and length, and print its reverse
//***************************************************************************************************************************

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {
    
        //scan for the user input
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String strIn = scan.nextLine();
        
        //first check for the length greater than 1
        while (strIn.length() < 2) {
            System.out.println("String length should not less than two.");
            System.out.println("Enter a String: ");
            strIn = scan.nextLine();
        }
        
        //count equal to the length of inputted string because the loop should repeat for each character
        //strFilter is an uppercase version of strIn so all letter values will be between 65 and 90 on the ascii table
        int count = strIn.length();
        String strFilter = strIn.toUpperCase();
        
        //repeats for each character, if char is not a letter, strIn removes that char through 2 substrings that exclude that index
        //if removing these characters causes strIn.length() to go below 2, a new string must be inputted  and loop count reset because string length must be greater than 1 even after removing non-letter characters
        while (count > 0) {
            if (!(strFilter.charAt(count - 1) > 64 && strFilter.charAt(count - 1) < 91)) {
                strIn = strIn.substring(0, count - 1) + strIn.substring(count);
                }
            while (strIn.length() < 2) {
                System.out.println("String length should not less than two.");
                System.out.println("Enter a String: ");
                strIn = scan.nextLine();
                count = strIn.length() + 1;
                strFilter = strIn.toUpperCase();
            }
            count--;
        }
        
        //printing relevant information to the new string (excluding non-letter characters)
        System.out.println("The letter string: " + strIn);
        System.out.println("Length: " + strIn.length());
        int length = strIn.length();
        System.out.println("First letter: " + strIn.charAt(0));
        System.out.println("Last letter: " + strIn.charAt(length - 1));
        String strRev = "";
        count = strIn.length();
        
        //for each loop repetition, the characters in strIn are added to strRev in reverse order (right to left)
        while (count > 0) {
            strRev = strRev + strIn.charAt(count - 1);
            count--;
            }
        
        //printing reversed string
        System.out.println("The reverse string: " + strRev);    
                
    }
}