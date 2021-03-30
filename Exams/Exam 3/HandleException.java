//-------------------------------------------
// HandleException.java
// Author: Carter Schmidt
//
//-------------------------------------------
import java.util.*;
public class HandleException {

    public static void main(String[] args) {
    
        String[] numbers = generateStringNumberArray();
        
        // calculate the summation, your code start from here.
      try {
          int[] num = new int[numbers.length];
           for (int i = 0; i < numbers.length; i++) {
               num[i] = Integer.parseInt(numbers[i]);
             }
      } catch (NumberFormatException a) {
          numbers[i] = 0;
      }
      int sum = 0;
        for ( int i = 0; i < num.length; i++) {
            sum += num[i];
      }
      System.out.println("Sum: " + sum);
            
    }
    
    public static String[] generateStringNumberArray() {
    
        String[] numbers = "1 2 3 4 5 6 7 8 9 10".split(" ");
        numbers[3] = "a";
        numbers[5] = null;
        
        return numbers;
    }
}