import java.util.Scanner;
public class MatrixOperations {
    
    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
    
        Matrix A = new Matrix();
        A.viewMatrix();
        A.getRowEchelon();
        A.viewMatrix();
        A.getRoots();
        A.viewMatrix();
    }
    

}