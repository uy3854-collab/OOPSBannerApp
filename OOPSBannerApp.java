public class OOPSBannerApp {

    public static void main(String[] args) {

        String O[] = printO();
        String P[] = printP();
        String S[] = printS();

        for(int i = 0; i < 7; i++)
        {
            System.out.println(O[i] + "  " + O[i] + "  " + P[i] + "  " + S[i]);
        }

    }

    public static String[] printO()
    {
        return new String[] {
            " ***** ",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            " ***** "
        };
    }

    public static String[] printP()
    {
        return new String[] {
            "****** ",
            "*     *",
            "*     *",
            "****** ",
            "*      ",
            "*      ",
            "*      "
        };
    }

    public static String[] printS()
    {
        return new String[] {
            " ***** ",
            "*     *",
            "*      ",
            " ***** ",
            "      *",
            "*     *",
            " ***** "
        };
    }

}