//**************************************************************************************
// author: Carter Schmidt  date: 8/28/2020
// purpose: Create a Clock that displays time as total seonds and in 24 hour format
//**************************************************************************************

import java.util.Scanner;
public class Clock {
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
    
    
    //collecting inputs
    System.out.println("Please enter the Hours: ");
    hours = scan.nextInt();
    System.out.println("Please enter the Minutes: ");
    minutes = scan.nextInt();
    System.out.println("Please enter the Seconds: ");
    seconds = scan.nextInt();
    
    //equation to find the total seconds
    total = ((hours * HOURS_TO_SECONDS) + (minutes * MINUTES_TO_SECONDS) + seconds);
    
    //printing the time in 24 hour format and in total seconds
    System.out.println("The time you have entered is " + hours + ":" + minutes + ":" + seconds);
    System.out.println("The total seconds: " + total);
      
    }
}