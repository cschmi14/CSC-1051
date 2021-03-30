import java.util.Scanner;

public class Hex2Bin {

    static public void  main (String[] args) {
    
        String[] hexBits = { "0000", "0001", "0010", "0011",
                             "0100", "0101", "0110", "0111",
                             "1000", "1001", "1010", "1011",
                             "1100", "1101", "1110", "1111"};
                             
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a Hexadecimal string: ");
        String hex = scan.next();
        // put your code here.
        System.out.print("The equivalent binary for hexadecimal " + hex + " is: ");
        int x = 0;
        for (int i = 0; i < hex.length(); i++) {
            x = Hex2Dec(hex.charAt(i));
            System.out.print(hexBits[x] + " ");
        }

    }
    
    // you may consider use this method
    static public int Hex2Dec(char c) {
        //ascii table for numbers 0-9
        if (c < 60) {
            return (c - 48);
        }
        //switch for letters
        else {
            char x = Character.toUpperCase(c);
            switch (x) {
                case 'A' :
                    return 10;
                case 'B' :
                    return 11;
                case 'C' :
                    return 12;
                case 'D' :
                    return 13;
                case 'E' :
                    return 14;
                case 'F' :
                    return 15;
            }
        }
        //-1 if wrong input
        return -1;
    }
    
    
}