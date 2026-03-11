import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {

    public static void main(String[] args)
    {

        Map<Character, String[]> patternMap = new HashMap<>();

        patternMap.put('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        patternMap.put('P', new String[]{
                "****** ",
                "*     *",
                "*     *",
                "****** ",
                "*      ",
                "*      ",
                "*      "
        });

        patternMap.put('S', new String[]{
                " ***** ",
                "*     *",
                "*      ",
                " ***** ",
                "      *",
                "*     *",
                " ***** "
        });

        printBanner("OOPS", patternMap);

    }

    public static void printBanner(String word, Map<Character,String[]> map)
    {
        for(int i = 0; i < 7; i++)
        {
            for(int j = 0; j < word.length(); j++)
            {
                char ch = word.charAt(j);
                System.out.print(map.get(ch)[i] + "  ");
            }
            System.out.println();
        }
    }

}