//***************************************************************************************************************************
// Author: Carter Schmidt  Date: 9/23/2020
// Purpose: Randomly generate a string  or a random length and reverse the case of all letters in the string
//***************************************************************************************************************************
import java.util.Random;

public class RandomStringBonus {

    public static void main(String[] args) {
    
        //generate random number length from 1 to 20
        Random r = new Random();
        int n = r.nextInt(20) + 1;
        System.out.println("Generating a random string with length " + n);
        
        //str is a string that will have a random character added to it until it is of length n
        int count = 0;
        String str = "";
        char c;
        
        //for each loop repetition, adds a random character to the string using ascii table char values
        while (count < n) {
            c = (char)(r.nextInt(94) + 33);
            str = str + c;
            count++;
            }
            
        System.out.println(str);
        char c2;
        count = 0;
        
        //if the char value is an upper case letter on ascii table, str will replace the character with the lowercase version of the character and vice versa
        while (count < n) {
            c = str.charAt(count);
            if (64 < c && c < 91) {
                c = Character.toLowerCase(c);
                if (count > 0)
                    str = str.substring(0, count) + c + str.substring(count + 1);
                else if (count == 0)
                    str = c + str.substring(count + 1);
            }
            else if (96 < c && c < 173) {
                c = Character.toUpperCase(c);
                if (count > 0)
                    str = str.substring(0, count) + c + str.substring(count + 1);
                else if (count == 0)
                    str = c + str.substring(count + 1);
                }
            count++;
        }
        
        System.out.println("After case reverse: " + str);
        
    }
}