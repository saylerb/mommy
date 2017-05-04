import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by bsayler on 5/4/17.
 */
public class Mommy {
    public String mommyficar(String word) {

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
        List<String> vowelList = Arrays.asList("a", "e", "i", "o", "u");

        return vowelList.contains(letter);
    }
}
