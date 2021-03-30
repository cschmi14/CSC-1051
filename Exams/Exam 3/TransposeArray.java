import java.util.Random;


public class TransposeArray {

   public static void main(String[] args) {
   
      int[][] array2D = randomArray();
      
     
   
   }
   
   public static int[][] randomArray() {
   
      Random gen = new Random();
      int row = gen.nextInt(2) + 2;
      int col = gen.nextInt(4) + 3;
      
      int[][] array2D = new int[row][col];
      System.out.println("original 2d array: ");
      for ( int i = 0; i < array2D.length; i++) {
          for ( int j = 0; j < array2D[0].length; j++) {
              array2D[i][j] = gen.nextInt(10);
              System.out.print(array2D[i][j] + " ");
          }
          System.out.println();
      }
      
      return array2D;
      
   }
}