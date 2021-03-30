//*****************************
// 7. Class
// Author: Carter Schmidt
//
//*****************************
import java.util.Random;
public class Dice {

    private int faceValue;
    private final int MAX_VALUE;
    Random r = new Random();
    
    public Dice (int max) {
        MAX_VALUE = max;
        faceValue = 0;
    }
    
    public int roll() {
        faceValue = r.nextInt(MAX_VALUE) + 1;
        return faceValue;
    }
    
    public int getValue() {
        return faceValue;
    }

}