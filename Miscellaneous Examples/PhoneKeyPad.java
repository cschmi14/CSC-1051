import java.util.Scanner;
public class PhoneKeyPad {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        str = str.toLowerCase();
        int c = 0;
        while (c < str.length()) {
            switch (str.charAt(c)) {
                case 'a' : case 'b' : case 'c' :
                    System.out.println("2");
                    break;
                case 'd' : case 'e' : case 'f' :
                    System.out.println("3");
                }
            c++;
            }
        
    }
}