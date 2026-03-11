/**
 * UC4 - OOPS Banner using Array and Loop
 * Improves modularity using arrays.
 * 
 * @author Umesh
 * @version 4.0
 */

public class OOPSBannerApp {

    public static void main(String[] args) {

        String line1 = String.join(" ",
                " ***** ", " ***** ", " ***** ", " ***** ");

        String line2 = String.join(" ",
                "*     *", "*     *", "*     *", "*     *");

        String line3 = String.join(" ",
                "*     *", "*     *", "*     *", "*     *");

        String line4 = String.join(" ",
                "*     *", "*     *", " ***** ", " ***** ");

        String line5 = String.join(" ",
                "*     *", "*     *", "*      ", "      *");

        String line6 = String.join(" ",
                "*     *", "*     *", "*      ", "      *");

        String line7 = String.join(" ",
                " ***** ", " ***** ", "*      ", " ***** ");

        // Store lines in array
        String banner[] = {
                line1,line2,line3,line4,line5,line6,line7
        };

        // Print using loop
        for(String line : banner){
            System.out.println(line);
        }
    }
}