public class SquaredSum {
 
    public static double SqSum(double a, double b) {
        double sqSum = Math.pow(a, 2) + Math.pow(b, 2);
        return sqSum;
    }
    public static void main(String[] args) {
        System.out.println(SqSum(20, 2));
    }

}