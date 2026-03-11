public class OOPSBannerApp {

    static class CharacterPattern
    {
        char character;
        String pattern[];

        CharacterPattern(char character, String pattern[])
        {
            this.character = character;
            this.pattern = pattern;
        }

        public String[] getPattern()
        {
            return pattern;
        }
    }

    public static void main(String[] args)
    {

        CharacterPattern O = new CharacterPattern('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        CharacterPattern P = new CharacterPattern('P', new String[]{
                "****** ",
                "*     *",
                "*     *",
                "****** ",
                "*      ",
                "*      ",
                "*      "
        });

        CharacterPattern S = new CharacterPattern('S', new String[]{
                " ***** ",
                "*     *",
                "*      ",
                " ***** ",
                "      *",
                "*     *",
                " ***** "
        });

        String oPattern[] = O.getPattern();
        String pPattern[] = P.getPattern();
        String sPattern[] = S.getPattern();

        for(int i = 0; i < 7; i++)
        {
            System.out.println(oPattern[i] + "  " + oPattern[i] + "  " + pPattern[i] + "  " + sPattern[i]);
        }

    }

}