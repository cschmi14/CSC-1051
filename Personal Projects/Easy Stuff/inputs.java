//********************************************************************
//  TellMeAboutYou.java       Author: 
//
//********************************************************************


// import Scanner class
import java.util.Scanner;
public class inputs {

    public static void main (String[] args) {

        // declare the name and age variables
        String name;
        int age;
                
        // declare Scanner object to collect input
        Scanner scan = new Scanner(System.in);
        
        // collect name
        System.out.print ("enter your name");
        name = scan.next();
        
        // collect age
        System.out.println("enter your age");
        age = scan.nextInt();
        
        // print welcome information
        System.out.println("Welcome " + name);
    }
}