import java.io.*;
import java.util.Scanner;
public class WordsCounter {

    public static void main(String[] args) throws IOException {
        
        File intro = new File("intro.txt");
        Scanner scan = new Scanner(intro);
        int count = 0;
        while (scan.hasNext() == true) {
            count++;
            scan.next();
        }   
        System.out.println("Total Words: " + count);
        
    }

}