//-------------------------------------------
// ResizeArray.java
// Author: Carter Schmidt
//
//-------------------------------------------

import java.util.Random;


public class ResizeArray {

   public static void main(String[] args) {
   
      int[] array = randomEvenArray();
      
      // your code starts from here...
      int l = array.length;
      int[][] copy = new int[2][(l / 2)];
      int x = 0;
      for (int i = 0; i < 2; i++) {
         for (int j = 0; j < (l / 2); j++) {
             copy[i][j] = array[x];
             x++;
          }
      }
      
      
      
      System.out.println("resized array: ");
      for (int i = 0; i < 2; i++) {
         for (int j = 0; j < (l / 2); j++) {
             System.out.print(copy[i][j] + " ");
          }
          System.out.println();
      }
      
      
      
   
   }
   
   public static int[] randomEvenArray() {
   
      Random gen = new Random();
      int length = (gen.nextInt(10) + 4) * 2;
      
      int[] array = new int[length];
      System.out.print("original array: ");
      for ( int i = 0; i < array.length; i++) {
         array[i] = gen.nextInt(2);
         System.out.print(array[i] + " ");
      }
      
      System.out.println();
      
      return array;
      
   }
}