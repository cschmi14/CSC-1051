import java.util.Scanner;
public class ThreeM {
    public static void main(String[] args) {
       int m, c = 3;
       Scanner scan = new Scanner(System.in);
       m = 1;
       while (m <= 4) {
           c = 3;
           while (c > 0) {
               System.out.print(m);
               c--;
           }
           System.out.println();
           m++;
       }
    }
}