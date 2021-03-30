import java.util.Scanner;
public class inputValidation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input an odd number");
        int num = scan.nextInt();
        while (num % 2 == 0) {
            System.out.println("Input an odd number");
            num = scan.nextInt();
        }
    }
}