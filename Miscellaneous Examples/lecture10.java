public class lecture10 {

    public static void main(String[] args) {
        String s = "abc";
        try {
            for (int i = 0;  i < 3; i++) {
                System.out.println(s.charAt(i));
            }
        } catch (StringIndexOutOfBoundsException a) {
            System.out.println("meets the end.");
        } finally {
            System.out.println("print finished.");
        }
    }

}