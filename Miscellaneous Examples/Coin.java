import java.util.Scanner;
import java.lang.Math;
import java.util.Random;

public class Coin {

    public static void main (String[] args) {
        
        Random r = new Random();
        System.out.println("Toss a coin!");
        int value, c = 0;
        value = r.nextInt(400);
        double money = 0.84;
        while (c != 1) {
        value = r.nextInt(400);
        if (value < 15) {
           value = r.nextInt(32);
           if (value == 1) {
               System.out.println("Money Spent: " + (int)money);
               c = 1;
               }
           }
           money = money + 0.84;
        }
               
    }
}