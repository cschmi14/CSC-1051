import java.util.*;
import java.util.Random;
import java.util.Scanner;
public class LocatingLargestArrayList {

    public static void main(String[] args) {
        
        Random r = new Random();
        Scanner scan = new Scanner(System.in);
        ArrayList<Double> list = new ArrayList<Double>();
        for (int i = 0; i < 5; i++) {
            list.add((r.nextDouble() * 100) + 1);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        Double max = new Double(0);
        int index = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).compareTo(max) > 0) {
                max = list.get(i);
                index = i;
            }
        }
        System.out.println();
        System.out.println(max);
        System.out.println(index);
     
    }

}