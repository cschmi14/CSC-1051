//*****************************
// 9. ragged array, exception
// Author: Carter Schmidt
//
//*****************************

import java.lang.Math;

public class RaggedArray {

    public static void main(String[] args) {
   
        int[][] array2d = {{5, 1, 3, 9}, {10, 2}, {7, 1, 4}};
        
        int column = (int)(Math.random()*4);
        
        int sum = 0;
        try {
            for (int i = 0; i < array2d.length; i++) {
                sum = sum + array2d[i][column];
            }
        } catch (ArrayIndexOutOfBoundsException c2) {
            try {
                sum = sum + array2d[2][column];
            } catch (ArrayIndexOutOfBoundsException c3) {
            } 
        } 
        System.out.println("The sum of column " + column + " is " + sum);
    }

}