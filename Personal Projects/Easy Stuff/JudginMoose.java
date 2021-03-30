import java.util.Scanner;
public class JudginMoose {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int l = scan.nextInt();
        int r = scan.nextInt();
        int max = 0;
        String str1 = "";
        if ((l + r) % 2 != 0)
            str1 = "Odd ";
        else
            str1 = "Even ";
        if (l + r <= 0) {
            System.out.println("Not a moose");
            return;
        }
        if (l > r)
            max = l * 2;
        else
            max = r * 2;
        System.out.println(str1 + max);
    }

}