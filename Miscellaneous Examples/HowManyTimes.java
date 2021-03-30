import java.util.Random;
import java.util.Scanner;
public class HowManyTimes {
    public static void main(String[] args) {
    Random r = new Random();
    Scanner scan = new Scanner(System.in);
    int[] array = new int[20];
    for (int i = 0; i < array.length; i++) {
        array[i] = r.nextInt(20) + 1;
    }
    for (int i = 0; i < array.length; i++) {   
        System.out.print(array[i] + " ");
    }
    System.out.println();
    System.out.println("Enter an integer: ");
    int x = scan.nextInt();
    int count = 0;
    for (int i = 0; i < array.length; i++) {   
        if (array[i] == x)
            count++;
    }
    System.out.println("Count: " + count);
    
    }
}