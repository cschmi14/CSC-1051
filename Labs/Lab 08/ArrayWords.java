
public class ArrayWords {

    public static void  main (String[] args) {
    
        String sentence = "Java is a class-based, object-oriented programming language that is designed to have as few implementation dependencies" 
                          + "as possible. It is a general purpose programming language intended to let application developers write once, run anywhere (WORA)," 
                          + "meaning that compiled Java code can run on all platforms that support Java without the need for recompilation.";
        
        // Your code goes here.
    
        String[] words = sentence.split(" ");
        
        System.out.println("Total words: " + words.length);
        
        String longStr = words[0];
        for (String x : words) {
        
            if (x.length() > longStr.length())
                longStr = x;
        
        }
        
        System.out.println("Longest word: " + longStr);
        
        String shortStr = words[0];
        for (String x : words) {
        
            if (x.length() < shortStr.length())
                shortStr = x;
        
        }
        
        System.out.println("Shortest word: " + shortStr);
    }

}