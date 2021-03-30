//*****************************
// 7. Class
// Author: Carter Schmidt
//
//*****************************

import java.util.Random;

public class GameRoom {

    public static void main(String[] args) {
    
        // your code starts from here.
        Dice d4 = new Dice(4);
        Dice d6 = new Dice(6);
        Dice d8 = new Dice(8);
        System.out.println("Rolling three dices: ");
        System.out.print(d4.roll() + ", " + d6.roll() + ", " + d8.roll());
        int sum = d4.getValue() + d6.getValue() + d8.getValue();
        System.out.println();
        System.out.println("sum: " + sum);
    
    }
}
