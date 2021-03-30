import java.util.Scanner;
public class FinalPriceCalc {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double op;
        double salePercentage;
        double finalPrice;
        final double TAX_RATE = 1.08;
        System.out.println ("What is the Original Price? ");
        op = scan.nextDouble();
        System.out.println("What is the sale percentage (ex: 20% off would be \"20\")? ");
        salePercentage = scan.nextInt();
        finalPrice = (op * (1 - (salePercentage / 100))) * TAX_RATE;
        System.out.println("The Final Price will be " + finalPrice + " dollars.");
        }
}
        
    