import java.util.Scanner;
import java.util.Random;
public class Do {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random r = new Random();
        int count = 0;
        for (int i = 1; i <= 100; i++) {
            int dice = r.nextInt(6) + 1;
            if (dice == 3)
                count++;
               
        }
        System.out.println(count);
            
    }
}