//*************************************************************************************
// Author: Carter Schmidt  Date: 9/23/2020
// Purpose: Play rock paper scissors with pseudo-randomly generated computer move
//*************************************************************************************
import java.util.Scanner;
import java.util.Random;

public class HandGame {

    public static void main(String[] args) {
        
        //collect user input as string (their move)
        Scanner scan = new Scanner(System.in);
        System.out.println("Let's play the Rock, Paper, Scissors!");
        System.out.println("What do you have: ");
        String strIn = scan.next();
        
        //convert to uppercase to ignore case in conditions
        strIn = strIn.toUpperCase();
        
        //input validation
        while (!(strIn.equals("ROCK") || strIn.equals("PAPER") || strIn.equals("SCISSORS"))) {
            System.out.println("Wrong input!");
            System.out.println("What do you have: ");
            strIn = scan.next();
            strIn = strIn.toUpperCase();
        }
        
        //x is a random number from 1 to 3
        Random r = new Random();
        int x = r.nextInt(3) + 1;
        
        //computer has rock
        if (x == 1) {
            if (strIn.equals("ROCK"))
                System.out.println("Computer has Rock, draw");
            if (strIn.equals("PAPER"))
                System.out.println("Computer has Rock, you win!");
            if (strIn.equals("SCISSORS"))
                System.out.println("Computer has Rock, you lose!");
            return;
        } 
        
        //computer has paper
        if (x == 2) {
            if (strIn.equals("ROCK"))
                System.out.println("Computer has Paper, you lose!");
            if (strIn.equals("PAPER"))
                System.out.println("Computer has Paper, draw");
            if (strIn.equals("SCISSORS"))
                System.out.println("Computer has Paper, you win!");
            return;
        }
            
        //computer has scissors
        if (x == 3) {
            if (strIn.equals("ROCK"))
                System.out.println("Computer has Scissors, you win!");
            if (strIn.equals("PAPER"))
                System.out.println("Computer has Scissors, you lose!");
            if (strIn.equals("SCISSORS"))
                System.out.println("Computer has Scissors, draw");
            return;
        }      
    }
}