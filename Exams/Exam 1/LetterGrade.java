import java.util.Scanner;
public class LetterGrade {
    public static void main(String[] args) {
        int grade;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the numeric point: ");
        grade = scan.nextInt();
    
        if (grade < 0 || grade > 100)
             System.out.println("The numeric point out of range."); 
        else if (grade <= 24)
            System.out.println("The letter grade is F.");
        else if (grade <= 44)
            System.out.println("The letter grade is E.");
        else if (grade <= 49)
            System.out.println("The letter grade is D.");
        else if (grade <= 59)
            System.out.println("The letter grade is C.");
        else if (grade <= 79)
            System.out.println("The letter grade is B.");
        else if (grade <= 100)
            System.out.println("The letter grade is A."); 
         
    }
}