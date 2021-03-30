//*****************************
// 5. Data Conversion, Method definition & overloading
// Author: Carter Schmidt
//
//*****************************

import java.util.Scanner;

public class Average {

    public static void main(String[] args) {
   
        double average1 = average(2, 3);
        double average2 = average(4, 3, 6);
        
        System.out.println("average1: " + average1);
        System.out.println("average2: " + average2);
        
    }
    
    // please design your average methods from here.
    // your code starts from here.
    
    public static double average(int x, int y, int z) {
        double avg = 0;
        double sum = 0;
        sum = x + y + z;
        avg = sum / 3;
        return avg;
    }
    
    public static double average(int x, int y) {
        double avg = 0;
        double sum = 0;
        sum = x + y;
        avg = sum / 2;
        return avg;
    }
    
}