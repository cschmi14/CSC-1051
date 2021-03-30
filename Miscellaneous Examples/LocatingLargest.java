import java.util.Random;
import java.util.Scanner;
public class LocatingLargest {
    public static void main(String[] args) {
    Random r = new Random();
    Scanner scan = new Scanner(System.in);
    int[] array = new int[10];
    for (int i = 0; i < array.length; i++) {
        array[i] = r.nextInt(100) + 1;
    }
    for (int i = 0; i < array.length; i++) {   
        System.out.print(array[i] + " ");
    }
    System.out.println();
    int max = 0;
    for (int i = 0; i < array.length; i++) {   
        if (array[i] > max)
            max = array[i];
    }
    System.out.println(max);
    }
}