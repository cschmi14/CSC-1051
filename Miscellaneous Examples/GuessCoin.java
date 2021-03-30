import java.util.Random;
import java.util.Scanner;

public class GuessCoin {
    public static void main(String[] args) {

        Random gen = new Random();
        int coin = gen.nextInt(2);

        Scanner scan = new Scanner(System.in);
        System.out.print("Input your guess: ");
        
        // write your code here:
        String guess;
        guess = scan.next();
        boolean head;
        boolean tail;
        if (coin == 1)
            head = true;
        else
            tail = true;
        if (guess == "head") {
            if (head = true)
                System.out.println("Correct! Coin head!");
            else
                System.out.println("Wrong! Coin tail!");
            }
        else if (guess == "tail") {
            if (tail = true)
                System.out.println("Correct! Coin tail!");
            else
                System.out.println("Wrong! Coin head!");
        }
        

    }
}