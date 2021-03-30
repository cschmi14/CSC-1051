import java.util.Scanner;

public class RelationalSimulator {

    public static void main (String[] args) {
    
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter operator (either >, < or ==): ");
        String operator = scan.next();
        
        System.out.print("Enter number1 and number2 respectively: ");
        int number1 = scan.nextInt();
        int number2 = scan.nextInt();
        
        // please write down your code below:
        
     
        boolean x = false;
        switch (operator) {
            case ">" :
                x = number1 > number2;
                System.out.println("The boolean expression of " + number1 + operator + number2 + " is:");
                System.out.println(x);  
                break;   
            case "<" :
                x = number1 < number2;
                System.out.println("The boolean expression of " + number1 + operator + number2 + " is:");
                System.out.println(x);  
                break;
            case "==" :
                x = number1 == number2;
                System.out.println("The boolean expression of " + number1 + operator + number2 + " is:");
                System.out.println(x);  
                break;
            default :
                System.out.println("The boolean expression of " + number1 + operator + number2 + " is:");
                System.out.println("Invalid operator!");
                break;
        }                            
    }
}