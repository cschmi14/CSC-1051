import java.util.Scanner;
public class MonthInNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String month = scan.next();
        switch (month) {
            case "January" :
                System.out.println("1");
                break;
            case "February" :
                System.out.println("2");
                break;
            case "March" :
                System.out.println("3");
                break;
            default :
                System.out.println("0");
                
        }
    }
}