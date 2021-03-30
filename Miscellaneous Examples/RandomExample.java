import java.util.Random;
public class RandomExample {
    public static void main(String[] args) {
        long seed = 200;
        Random r = new Random();
        System.out.println(r.nextInt(3) + 1);
        System.out.println(r.nextInt(80) + 21);
    }
}