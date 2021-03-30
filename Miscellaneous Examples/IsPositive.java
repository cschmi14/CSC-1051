public class IsPositive {
    
    public static void main(String[] args) {
        System.out.println(printN(4, "hi"));
    }
    
    public static void isPositive (int numi) {
        if (numi > 0)
            System.out.println("positive");
        else if (numi < 0)
            System.out.println("negative");
    }
    
    public static String printN(int n, String stri) {
        String str = stri;
        while (n > 1) {
            str = str + stri;
            n--;
        }
        return str;
    }

}