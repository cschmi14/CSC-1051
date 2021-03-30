//-------------------------------------------
// HandleException.java
// Author: Carter Schmidt
//
//-------------------------------------------
import java.util.Random;
import java.util.ArrayList;

public class LocatingLongestArrayList {

   public static void main(String[] args) {
      
      ArrayList<String> strList = createStringArrayList();
      
      // your code starts from here...
      
      String longest = strList.get(0);
      int index = 0;
      
      for (int i = 0; i < strList.size(); i++) {
          if (strList.get(i).length() > longest.length()) {
              longest = strList.get(i);
              index = i;
          }
      }
      
      
      System.out.println("longest String: " + longest);
      System.out.println("longest String index: " + index);
      
   }
   
   public static ArrayList<String> createStringArrayList() {
   
      ArrayList<String> strList = new ArrayList<String>();
      
      strList.add("Object");
      strList.add("Integer");
      strList.add("Exception");
      strList.add("Class");
      strList.add("Java");
      strList.add("ArrayLists");
      strList.add("File");
      
      return strList;
   }
}