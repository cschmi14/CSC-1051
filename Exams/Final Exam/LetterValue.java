//*****************************
// 3. Switch statement
// Author: Carter Schmidt
//
//*****************************
import java.util.Scanner;
public class LetterValue {

    public static void main(String[] args) {
   
        // your code starts from here.
        
        Scanner scan = new Scanner(System.in);
        System.out.println("input a letter sequence: ");
        String str = scan.next();
        int sum = 0;
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
        
            switch (str.charAt(i)) {
            
                case ('a') : {
                    sum += 3;
                    break;
                }
                case ('b') : {
                    sum += 3;
                    break;
                }
                case ('c') : {
                    sum += 8;
                    break;
                }
                case ('d') : {
                    sum += 8;
                    break;
                }
                case ('e') : {
                    sum += 5;
                    break;
                }
                case ('f') : {
                    sum += 5;
                    break;
                }
                case ('g') : {
                    sum += 6;
                    break;
                }
                case ('h') : {
                    sum += 6;
                    break;
                }
                default : {
                    sum += 1;
                }
            
            }
        
        }
        
        System.out.println("The value is: " + sum);
        
    }
}