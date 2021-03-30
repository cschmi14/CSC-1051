import java.util.Random;
public class RandomLengthStringBonus {
    public static void main(String[] args) {
        Random r = new Random();
        int n = r.nextInt(20) + 1;
        System.out.println("Generating a random string with length " + n);
        int count = 0;
        String str = "";
        char c;
        while (count < n) {
            c = (char)(r.nextInt(94) + 33);
            str = str + c;
            count++;
            }
        System.out.println(str);
        char c2;
        count = 0;
        while (count < n) {
            c = str.charAt(count);
            if (64 < c && c < 91) {
                c = Character.toLowerCase(c);
                if (count > 0)
                    str = str.substring(0, count) + c + str.substring(count + 1);
                else if (count == 0)
                    str = c + str.substring(count + 1);
            }
            else if (96 < c && c < 173) {
                c = Character.toUpperCase(c);
                if (count > 0)
                    str = str.substring(0, count) + c + str.substring(count + 1);
                else if (count == 0)
                    str = c + str.substring(count + 1);
                }
            count++;
        }
        System.out.println("After case reverse: " + str);
    }
}