//***************************************************************************************************************************
// Author: Carter Schmidt  Date: 9/23/2020
// Purpose: Read a string of a random length and reverse the case of all letters in it
//***************************************************************************************************************************
import java.util.Scanner;
import java.util.Random;

public class RandomString {

    public static void main(String[] args) {
    
        //randomly generate length for the string
        Random r = new Random();
        Scanner scan = new Scanner(System.in);
        int n = r.nextInt(20) + 1;
        
        //collect input string
        System.out.println("Please enter a string with length " + n);
        String strIn = scan.nextLine();
        
        //check if the string is actually length n (input validation)
        while (strIn.length() != n) {
            System.out.println("Please enter a string with length " + n);
            strIn = scan.nextLine();
        }
        
        /*for each character in the string, if it is lowercase on the ascii table, then the loop will replace the character with an uppercase
        version of the character using substrings and vice versa */
        char c;
        char c2;
        int count = 0;
        while (count < n) {
            c = strIn.charAt(count);
            //if c is uppercase letter, replace it with a lowercase letter
            if (64 < c && c < 91) {
                c = Character.toLowerCase(c);
                if (count > 0)
                    strIn = strIn.substring(0, count) + c + strIn.substring(count + 1);
                else if (count == 0)
                    strIn = c + strIn.substring(count + 1);
            }
            //if c is lowercase letter, replace it with uppercase letter
            else if (96 < c && c < 173) {
                c = Character.toUpperCase(c);
                if (count > 0)
                    strIn = strIn.substring(0, count) + c + strIn.substring(count + 1);
                else if (count == 0)
                    strIn = c + strIn.substring(count + 1);
                }
                
            count++;
        }
        
        System.out.println("After case reverse: " + strIn);
        
    }
}