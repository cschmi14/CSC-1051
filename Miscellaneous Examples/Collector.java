import java.util.Scanner;
public class Collector {
    public static void main(String[] args) {
    int num1, num2, num3;
    Scanner scan = new Scanner(System.in);
    num1 = scan.nextInt();
    num2 = scan.nextInt();
    num3 = scan.nextInt();
    if ((num1 > 0 && ((num1 % 2) == 0)) && (num2 < 10 || num2 > 20) && (num3 > (num1 + num2))){
            System.out.println("found");
            return;
    }
    else {
        System.out.println("Not found");
        return;
        }
        
    
    }
}