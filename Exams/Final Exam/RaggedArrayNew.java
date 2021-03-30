//*****************************
// 9. ragged array, exception
// Author: Carter Schmidt
//
//*****************************

import java.lang.Math;

public class RaggedArrayNew {

    public static void main(String[] args) {
   
        int[][] array2d = {{5, 1, 3, 9}, {10, 2}, {7, 1, 4}};
        
        int column = (int)(Math.random()*4);
        
        int sum = 0;
        for (int i = 0; i < array2d.length; i++) {
            if (!((column == 2 && i == 1) || (column == 3 && i != 0))) {
                sum = sum + array2d[i][column];
            }
        }
        
        System.out.println("The sum of column " + column + " is " + sum);
    }
    

}