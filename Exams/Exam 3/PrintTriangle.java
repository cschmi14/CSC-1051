//-------------------------------------------
// PrintTriangle.java
// Author: Carter Schmidt
//
//-------------------------------------------

import java.io.*;
import java.util.*;

public class PrintTriangle {

   public static void main(String[] args) throws IOException {
   
      // your code starts from here...
      Scanner scan = new Scanner(System.in);
      System.out.println("please enter an integer between 2 and 10: ");
      int n = scan.nextInt();
      
      File tFile = new File("triangle.txt");
      PrintWriter out = new PrintWriter(tFile);
      
      int r = 1;
      for (int i = 0; i < n; i++) {
             for (int j = r; j > 0; j--) {
                 out.print("*");
             }
         out.println();
         r++;
      }
      out.close();
      
      
   }
}