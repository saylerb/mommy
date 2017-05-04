import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Mommy {
    private final List<String> vowelList = Arrays.asList("a", "e", "i", "o", "u");

    public String mommy(String word) {

        String result = "";
        String previous = "";

        for (String letter : word.split("")) {

            if (isVowel(previous)) {
                result += "";
            } else if (isVowel(letter)) {
                result += "mommy";
            } else {
                result += letter;
            }
            previous = letter;
        }

        return result;
    }

    public boolean isVowel(String letter) {
        return vowelList.contains(letter);
    }

    public boolean vowelsGreaterThanOneThird(String word) {
        double count = 0;

        for (String letter : word.split("")) {
            if (isVowel(letter)) {
                count++;
            }
        }
        return Math.round(count / word.length()) > 0.33;
    }
}
