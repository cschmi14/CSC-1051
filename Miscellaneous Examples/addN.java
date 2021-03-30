import java.util.Scanner;
public class addN {
    public static void main(String[] args) {
       int sum = 0, num = -1, n, x = 1;
       Scanner scan = new Scanner(System.in);
       n = scan.nextInt();
       while (n > 0) {
           sum = sum + num;
           num = (num + 1) * x;
           x = x * -1;
           n--;
       }
       System.out.println(sum);
    }
}