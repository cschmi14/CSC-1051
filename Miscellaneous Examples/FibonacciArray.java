public class FibonacciArray {

    public static void main(String[] args) {
    
        int[] fib = new int[20];
        fib[0] = 1;
        fib[1] = 1;
        
        for (int i = 2; i < 20; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        
        
        for (int i = 0; i < 20; i++) {
            
            System.out.print(fib[i] + " ");
            
        }
        int sum = 0;
        for (int i = 0; i < 20; i++) {
            
            sum += fib[i];
            
        }
        double avg = (double)sum / 20;
        System.out.println();
        System.out.println(avg);
    }
        
}