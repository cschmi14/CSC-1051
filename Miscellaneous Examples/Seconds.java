import java.util.Scanner;
public class Seconds {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int sec = scan.nextInt();
    while (sec >= 0) {
        System.out.println(sec);
        sec--;
        }
    }
}