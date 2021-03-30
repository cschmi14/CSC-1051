public class GuessNumber {

    int targetNumber;
    int guessNumber;
    
    public GuessNumber() {
        targetNumber = 68;
    }
    
    private boolean isCorrect() {
        if (guessNumber == targetNumber)
            return true;
        else 
            return false;
    }
    
    private void showHint() {
        if (guessNumber < targetNumber)
            System.out.println("Guess Bigger.");
        else 
            System.out.println("Guess Smaller.");
    }
    
    public boolean Guess(int x) {
        guessNumber = x;
        if (isCorrect()) {
            System.out.println("Correct Guess!");
            return true;
        }
        else {
            showHint();
            return false;
        }
    }

}