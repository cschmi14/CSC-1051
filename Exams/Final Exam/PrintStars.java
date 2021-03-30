//*****************************
// 8. File Input and Output
// Author: Carter Schmidt
//
//*****************************

import java.io.*;
import java.util.*;

public class PrintStars {

    public static void main(String[] args) throws IOException {
   
        // your code starts from here.
        
        File inFile = new File("input.txt");
        File outFile = new File("output.txt");
        
        Scanner scan = new Scanner(inFile);
        PrintWriter out = new PrintWriter(outFile);
        int n = 0;
        
        while (scan.hasNextInt()) {
            n = scan.nextInt();
            for (int i = 0; i < n; i++) {
                out.print("*");
            }
            out.println();
        }
        out.close();
        
    }
}