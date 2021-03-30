import java.util.*;
import java.util.Random;
import java.util.Scanner;
public class HowManyTimesArrayList {

    public static void main(String[] args) {
        
        Random r = new Random();
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 20; i++) {
            list.add(r.nextInt(20) + 1);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        int x = scan.nextInt();
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).compareTo(Integer.valueOf(x)) == 0)
                count++;
        }
        System.out.println(count);
     
    }

}