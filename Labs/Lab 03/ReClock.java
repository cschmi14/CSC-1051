//**************************************************************************************
// author: Carter Schmidt  date: 8/28/2020
// purpose: Redo the original Clock.java program to prevent illegal input data
//**************************************************************************************

import java.util.Scanner;
public class ReClock {
    public static void main(String[] args) {
    
    //creating scanner object to collect inputs
    Scanner scan = new Scanner(System.in);
    
    //declaring variables
    int hours;
    int minutes;
    int seconds;
    int total;
    
    //declaring constants to convert hours/minutes into seconds
    final int HOURS_TO_SECONDS = 3600;
    final int MINUTES_TO_SECONDS = 60;
    
    
    //collecting inputs and preventing illegal inputs
    System.out.println("Please enter the Hours: ");
    hours = scan.nextInt();
    if (hours >= 24) {
        System.out.println("The value of Hours is >= 24.");
        return;
    } 
    else if (hours < 0) {
        System.out.println("Time value cannot be negative.");
        return;
    }  
    System.out.println("Please enter the Minutes: ");
    minutes = scan.nextInt();
    if (minutes >= 60) {
        System.out.println("The value of Minutes or Seconds >= 60.");
        return;
    } 
    else if (minutes < 0) {
        System.out.println("Time value cannot be negative.");
        return;
    }  
    System.out.println("Please enter the Seconds: ");
    seconds = scan.nextInt();
    if (seconds >= 60) {
        System.out.println("The value of Minutes or Seconds >= 60.");
        return;
    } 
    else if (seconds < 0) {
        System.out.println("Time value cannot be negative.");
        return;
    }  
    
    //equation to find the total seconds
    total = ((hours * HOURS_TO_SECONDS) + (minutes * MINUTES_TO_SECONDS) + seconds);
    
    //printing the time in 24 hour format and in total seconds
    System.out.println("The time you have entered is " + hours + ":" + minutes + ":" + seconds);
    System.out.println("The total seconds: " + total);
      
    }
}