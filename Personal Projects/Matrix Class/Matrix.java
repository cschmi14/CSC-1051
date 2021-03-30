import java.util.Scanner;
public class Matrix {

    Scanner scan = new Scanner(System.in);
    int m;
    int n;
    double [][] data;
    
    public Matrix () {
        System.out.println("Enter an augmented square matrix (square matrix plus a column vector of constants on the right).");
        System.out.println("Enter the rows: ");
        m = scan.nextInt();
        System.out.println("Enter the columns: ");
        n = scan.nextInt();
        data = new double [m][n];
        System.out.println("Enter the values for each row: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                data[i][j] = scan.nextInt();
            }
        }  
    }
    
    public void viewMatrix() {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) 
                System.out.printf("%10.2f ", data[i][j]);
            System.out.println();
        }
        System.out.println();
    }
    
    public void getRowEchelon() {
        System.out.println("Row Echelon Form: ");
        System.out.println();
        int x = m;
        for (int b = 0; b < m - 1; b++, x--) {
        
           int l = x;
           
           for (int c = 1; c < m && l > 1; l--, c++) {
           
               int i = m - c; 
               double multiple = data[i][b] / data[i - 1][b];
               while (multiple == 0) {
                   for (int j = 0; j < n; j++) {
                       data[i - 1][j] = data[i - 1][j] + data[i][j];
                   }
                   multiple = data[i][b] / data[i - 1][b];
               }
               
               
               for (int j = 0; j < n; j++) {    
                      
                   data[i][j] = data[i][j] - (data[i - 1][j] * multiple);
                   
               }
            }
            
        }
        for (int co = n - 2, r = m - 1; r >= 0; r--, co--) {
            double div = data[r][co];
            for (int c = co; c < n; c++) {
            
                data[r][c] = data[r][c] / div;
            
            }
        
        }
        
    } 
    
    public void getRoots() {
        System.out.println("The roots of the equation above are: ");
        for (int r = m - 1, co = n - 2; r > 0; r--, co--) {
            for (int i = r - 1; i >= 0; i--) {
                double multiple = data[i][co] / data[r][co];
                for (int j = co; j < n; j++) {
                    data[i][j] = data[i][j] - data[r][j] * multiple;
                }
            }
                
        
        }
        
        for (int r = 0; r < m; r++) {
         
            double x = data[r][n - 1];
         
            System.out.printf("%10.2f", x);
            System.out.print(" ");
        }
        System.out.println();
        System.out.println();
    }
}