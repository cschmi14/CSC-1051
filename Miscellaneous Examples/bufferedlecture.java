import java.io.*;
public class bufferedlecture {

    public static void main(String[] args) throws IOException {
      /*// create a FileReader object and then pass it to thconstructor of BufferedReader
      FileReader input = new FileReader("phoneNumbers.txt");
      BufferedReader inputStream = new BufferedReader(input);
      // read all line
      String line = "";
      while ((line = inputStream.readLine()) != null) {
      System.out.println(line);
      }
      // close the buffer
      inputStream.close();*/
      /*FileReader input = new FileReader("America_v2.txt");
      FileWriter outFile = new FileWriter("America_v2_cp.txt");
      BufferedReader inputStream = new BufferedReader(input);
      BufferedWriter outputStream = new BufferedWriter(outFile);
      String line = "";
      while ((line = inputStream.readLine()) != null) {
          outputStream.write(line);
      }
      inputStream.close();
      outputStream.close();*/
      FileReader in = new FileReader("numbers1.txt");
      BufferedReader inStream = new BufferedReader(in);
      String s = inStream.readLine();
      inStream.close();
      String[] num = s.split(" ");
      int max = 0;
      for (int i = 0; i < num.length; i++) {
          if (max < Integer.parseInt(num[i]))
              max = Integer.parseInt(num[i]);
      }
      System.out.println(max);
      
    }

}