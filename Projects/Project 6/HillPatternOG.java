import java.util.Scanner;
public class HillPatternOG {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int r, x = 0, h = 0, s = 0, ct = 0, sign = 1;
        do {
            System.out.println("Enter the rows: ");
            r = scan.nextInt();
            if (r <= 0)
                System.out.println("Input number should be positive.");
        } while (r <= 0);
        x = r;
        //loops repeat for ct times and ct is r * 2 - 1
        //sign makes it so "# "s decrease after halfway through the shape to make it symmetrical
        //prints the diamond shape
        for (h = 1; ct < ((2 * r) - 1); h = h + (2 * sign), x = x + (-1 * sign), ct++) {
            for (int c = x - 1; c > 0; c--) {
                System.out.print("  ");               
            }
            for (s = h; s > 0; s--) {
                System.out.print("# ");
            }
            for (int c = x - 1; c > 0; c--) {
                System.out.print("  ");
            }
            if (ct == r - 1)
                sign = sign * -1;
            System.out.println();          
        }
        System.out.println(" ");
        System.out.println(" ");
        //reset variable values to what they were before the first shape loop
        /*second loop is the same as the first but with the "# " and "  " inner loops switched as well as one if statement
        so the first and last lines of the second shape do not contain an extra "# "*/
        ct = 0;
        h = 1;
        sign = 1;
        //Prints square with diamond missing shape
        for (h = -1; ct < ((r * 2) - 1); h = h + 2 * sign, x = x + (-1 * sign), ct++) {
            for (int c = x - 1; c > 0; c--) {
                System.out.print("# ");               
            }
            for (s = h; s > 0; s--) {
                System.out.print("  ");
            }
            /*due to the different structure where the top line of the shape must include all "# " (the first shape starts
            at the second line of this shape with the "# " and "  " switched, this if statement prevents an extra "# " from being 
            printed on the top and bottom lines since these lines are added to enclose the inverted diamond shape, and do not
            fit the same pattern of adding/subtracting 2 "# "s and subtracting/adding 2 "  "s since that would produce an extra "# "
            on the top and bottom lines; that is why this if statement is here*/ 
            if (ct == 0 || ct == r * 2 - 2)
                    c--; 
            for (int c = x - 1; c > 0; c--) {
                System.out.print("# ");                             
            }
            if (ct == r - 1) 
                sign = sign * -1;  
            System.out.println();    
        }
    }
}