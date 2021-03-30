//*****************************
// 6. Array & Random Numbers
// Author: Carter Schmidt
//
//*****************************

import java.util.Random;
public class RandomArray {

    public static void main(String[] args) {
   
        // your code starts from here.
        
        Random r = new Random();
        int[] array = new int[r.nextInt(2) + 4];
        
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(10);
        }
        
        System.out.println("Random array is: ");
        
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        double avg = sum / array.length;
        
        System.out.println("The average is: " + avg);
        
    }
    

}