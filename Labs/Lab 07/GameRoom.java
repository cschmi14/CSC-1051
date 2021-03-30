import java.util.Scanner;
public class GameRoom {
    
    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        GuessNumber num = new GuessNumber();
        int x, counter = 0;
        System.out.println("Let's play Guess Number! The target number is an integer from 0 to 100: ");
        
        do {
        
            System.out.println("Please guess a number: ");
            x = scan.nextInt();
            counter++;
        
        } while (num.Guess(x) != true);
        
        System.out.println("Your total guess time: " + counter);
        
    }
    
    

}