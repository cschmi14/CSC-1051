import java.io.*;
import java.util.Scanner;
public class SummingNumbers {

    public static void main(String[] args) throws IOException {
    
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the file name you would like to read numbers from: ");
        String s = scan.next();
        
        FileReader in = new FileReader(s);
        BufferedReader inStream = new BufferedReader(in);
        String line = "";
        line = inStream.readLine();
        inStream.close();
        
        String[] nums = line.split(" ");
        int[] nums2 = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
             nums2[i] = Integer.parseInt(nums[i]);
        }
        
        System.out.println("Reading numbers from " + s);
        System.out.println();
        int sum = 0;
        for (int i = 0; i < nums2.length; i++) {
            System.out.print(nums2[i] + " ");
            sum += nums2[i];
        }
        System.out.println();
        System.out.println("Total is " + sum);
    
    }

}