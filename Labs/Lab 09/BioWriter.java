import java.io.*;
public class BioWriter {

    public static void main(String[] args) throws IOException {
        
        File bio = new File("bio.txt");
        PrintWriter out = new PrintWriter(bio);
        out.println("Name: Carter Schmidt");
        out.println("Major: Computer Science");
        out.close();
        
    }

}