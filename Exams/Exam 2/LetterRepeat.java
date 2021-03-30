import java.util.Scanner;

public class LetterRepeat {

    public static void main (String[] args) {
    
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter a word: ");
        String word = scan.next();
        
        System.out.print("Enter repeat time for each letter: ");
        int n = scan.nextInt();
        
        // please write down your code below.
        for (int l = word.length(), i = 0; l > 0; l--, i++) {
            for (int c = n; c > 0; c--) {
                System.out.print(word.charAt(i));    
            }
        }                  
    }
}