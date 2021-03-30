import java.util.ArrayList;


public class WordsModifier {

    public static void main (String[] args) {
        
        
        // Step 1:
        // Create an empty Arraylist object called words.
        // And then copy command line words to an Arraylist object
        ArrayList<String> words = new ArrayList<String>();
        for (int c = 0; c < args.length; c++) {
            words.add(args[c]);
        }
        

        // Step 2:
        // print out the value in ArrayList object words
        System.out.print("Words in origin ArrayList: ");
        for (int c = 0; c < words.size(); c++) {
            System.out.print(words.get(c) + " ");
        }
        System.out.println();
        // Step 3:
        // For every element in ArrayList object words: 
        // reverse the singulars and capitalize plurals
        for (int c = 0; c < words.size(); c++) {
            if (words.get(c).endsWith("s") || words.get(c).endsWith("S"))
                words.set(c, capitalize(words.get(c)));
            else
                words.set(c, reverse(words.get(c)));
        }
        
        // Step 4:
        // print the modified ArrayList object again
        System.out.print("Words in ArrayList after modifying: ");
        for (int c = 0; c < words.size(); c++) {
            System.out.print(words.get(c) + " ");
        }
    }
    
    
    // please filling the details of method capitalize
    public static String capitalize(String s) {
        s = s.toUpperCase(); 
        return s;    
    }
    
    // please filling the details of method reverse
    public static String reverse(String s) {
        char[] letters = new char[s.length()];
        for (int i = s.length() - 1, c = 0; i >= 0; i--, c++) {
            letters[i] = s.charAt(c);
        }
        String r = new String(letters);
        return r;
    }


}