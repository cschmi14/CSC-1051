//*******************************************************************************************
// author: Carter Schmidt  date: 9/30/2020
// purpose: print an input digit 0-9 in word form
//*******************************************************************************************
import java.util.Scanner;
public class PrintDigitInWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a digit: ");
        //num = input digit
        int num = scan.nextInt();
        //if not 0-9 prints invalid digit, if 0-9 prints appropriate word
        switch (num) {
            case 0 :
                System.out.println("ZERO");
                break;
            case 1 :
                System.out.println("ONE");
                break;
            case 2 :
                System.out.println("TWO");
                break;
            case 3 :
                System.out.println("THREE");
                break;
            case 4 :
                System.out.println("FOUR");
                break;
            case 5 :
                System.out.println("FIVE");
                break;
            case 6 :
                System.out.println("SIX");
                break;
            case 7 :
                System.out.println("SEVEN");
                break;
            case 8 :
                System.out.println("EIGHT");
                break;
            case 9 :
                System.out.println("NINE");
                break;
            default :
                System.out.println("Invalid Digit");
                break;
        }            
    }
}