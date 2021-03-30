//********************************************************************
//  FileInput.java       Author: Xue Qin
//
//  Demonstrates how to read a file line by line 
//********************************************************************

import java.io.*;
import java.util.Scanner;

public class FileInput {
    public static void main(String[] args) throws IOException {
        String line;
        /*File myFile = new File("number.txt");
        Scanner fileScan = new Scanner (myFile);

        while (fileScan.hasNext()) {
            line = fileScan.nextLine();
            if (line.startsWith("610"))
                System.out.println(line.toUpperCase());
        }*/
        String filePath = "number.txt";
        File outFile = new File(filePath);
        PrintWriter out = new PrintWriter(outFile);
        for (int i = 2; i <= 100; i += 2) {
            out.print(i + " ");
            }
        out.close();
        System.out.println();
    }
}