//*****************************************************************************************
// author: Carter Schmidt date: 9/30/2020
// purpose: print a wave of "$" with 80 rows and a max of 50 "$" using the cosine function
//*****************************************************************************************
public class Wave {
    public static void main(String[] args) {
        //x starts at 4 * pi and goes to zero since this is 2 full cosine waves
        //creates 80 rows since pi / 20 is subtracted from 4 * pi 80 times before it is equal to zero (loop stops)
        for (double x = (4 * Math.PI); x >= 0; x = x - (Math.PI / 20)) {
            /*c is rounded up from 25 times (cos(x) + 1); cos(X) + 1 fluctuates from 2 to 0 and back to 2 in each wave, so 
            multiplying by 25 creates a wave with a max of 50 "$" and a min of 0 "$"*/
            for (double c = Math.ceil(25 * (Math.cos(x) + 1)); c > 0; c--) {
                System.out.print("$");          
            }
        //creates new line after each line of "$"
        System.out.println("");
        }
    }
}