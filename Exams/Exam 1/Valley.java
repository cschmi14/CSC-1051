import java.util.Scanner;
public class Valley {
    public static void main(String[] args) {
        int a, b, c;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter an integer: ");
        a = scan.nextInt();
        System.out.println("Please enter an integer: ");
        b = scan.nextInt();
        System.out.println("Please enter an integer: ");
        c = scan.nextInt();
        if (a > b && b < c) {
            System.out.println("The numbers " + a + " " + b + " " + c + " is a valley.");
            }
        else {
            System.out.println("The numbers " + a + " " + b + " " + c + " is not a valley.");
        }  
    }
}