import java.io.*;
import java.util.*;
public class Lecture8 {

   public static void main(String[] args) throws IOException {
        
 //        String line;

//         File myFile = new File("phoneNumbers.txt");
//         Scanner fileScan = new Scanner (myFile);
// 
//         while (fileScan.hasNext()) {
//             line = fileScan.nextLine();
//             if (line.startsWith("610"))
//                 System.out.println(line);
//         }
// 
//         String filePath = "numbers.txt";
//         File outFile = new File(filePath);
//         
//         PrintWriter out = new PrintWriter(outFile);
//         
//         for (int i =2; i <= 100; i+=2) {
//             out.println(i);
//         }
// 
//         out.close();

//         String s = "America";
//         byte[] b = s.getBytes();
//         
//         for (int i = 0; i < b.length; i++) {
//             System.out.print(b[i] + " ");
//         }
//         
//         System.out.println();
        

//         // create a FileInputStream object
//         FileInputStream in = new FileInputStream ("America.txt");
//       
//         // read all byte
//         int c;
//         while ((c = in.read()) != -1) {
//             System.out.print(c + " ");
//         }
//       
//         // close the stream
//         in.close();
        
        
//         // create a FileInputStream object
//         FileInputStream in = new FileInputStream ("pixilGreen.png");
//       
//         // read all byte
//         int c;
//         while ((c = in.read()) != -1) {
//             System.out.print(c + " ");
//         }
//       
//         // close the stream
//         in.close();

      
//         // create a FileOutputStream object
//         FileOutputStream out = new FileOutputStream("out.txt");
//       
//         // write an array of byte
//         byte[] b = {65, 109, 101, 114, 105, 99, 97};
//         out.write(b);
//       
//         // close the stream
//         out.close();


//         // create two objects
//         FileInputStream in = new FileInputStream("phoneNumbers.txt");
//         FileOutputStream out = new FileOutputStream("phoneNumbers_cp.txt");
// 
//         // read from input and write through output
//         int c;
//         while ((c = in.read()) != -1) {
//             out.write(c);
//         }
// 
//         // close stream
//         in.close();
//         out.close();

//         // create two objects
//         FileReader input = new FileReader("America_v2.txt");
//         FileWriter output = new FileWriter("America_v2_cp.txt");
//         
//         BufferedReader in = new BufferedReader(input);
//         BufferedWriter out = new BufferedWriter(output);
// 
//         // read from input and write through output
//         String line = "";
//         while ((line = in.readLine()) != null) {
//             out.write(line + "\n");
//         }
// 
//         // close stream
//         in.close();
//         out.close();




//         // create a FileReader object and then pass it to the constructor of BufferedReader
//         FileReader input = new FileReader("phoneNumbers.txt");
//         BufferedReader inputStream = new BufferedReader(input);
//       
//         // read all line
//         String line = "";
//         while ((line = inputStream.readLine()) != null) {
//             System.out.println(line);
//         }
//       
//         // close the buffer
//         inputStream.close();


//         // create a FileReader object and then pass it to the constructor of BufferedReader
//         FileReader input = new FileReader("Numbers1.txt");
//         BufferedReader inputStream = new BufferedReader(input);
//       
//         // read numbers to line
//         String line = "";
//         line = inputStream.readLine();
//         
//         String[] strs = line.split(" ");
//         int[] nums = new int[strs.length];
//         
//         for (int i = 0; i < nums.length; i++) {
//             nums[i] = Integer.parseInt(strs[i]);
//         }
//         
//         // find max
//         int max = nums[0];
//         for (int i = 0; i < nums.length; i++) {
//             if (max < nums[i])
//                 max = nums[i];
//         }
//         
//         System.out.println("max: " + max);
//       
//         // close the buffer
//         inputStream.close();


        // create a FileReader object and then pass it to the constructor of BufferedReader
        FileReader input = new FileReader("Numbers2.txt");
        BufferedReader inputStream = new BufferedReader(input);
        
        ArrayList<Integer> slist = new ArrayList<Integer>();
      
        // read numbers to line
        String line = "";
        while ((line = inputStream.readLine()) != null ) {
            String[] strs = line.split(" ");
            for (int i = 0; i < strs.length; i++) {
                slist.add(Integer.parseInt(strs[i]));
            }
        }
        
        // find max
        Integer max = slist.get(0);
        for (Integer n : slist) {
            if (max < n)
                max = n;
        }
        
        System.out.println("max: " + max.intValue());
      
        // close the buffer
        inputStream.close();

    }
 
   
 

}