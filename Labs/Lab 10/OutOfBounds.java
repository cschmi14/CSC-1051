import java.util.Random;
import java.lang.RuntimeException;

public class OutOfBounds {

    public static void main(String[] args) {
    
        int[] numbers = {1, 2, 3};
    
        try {
        
            // generate a random index number between 0 to 9.
            
            Random r = new Random();
            int index = r.nextInt(10);
            
            // print the value at the random index in array numbers
            
            System.out.println("index: " + index);
            System.out.println(numbers[index]);
            
        } catch (ArrayIndexOutOfBoundsException a) {
        
            // when out of bounds exception thrown, catch it and print the message.
            
            System.out.println("Out of bounds");
            
        }       
    }
}