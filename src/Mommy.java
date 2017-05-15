import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Mommy {
    public static final String OUTPUT_WORD = "mommy";
    public static final double THRESHOLD = 0.30;
    private final List<String> vowelList = Arrays.asList("a", "e", "i", "o", "u");

    public String mommy(String word) {
        if (vowelsGreaterThanOneThird(word)) {
            return replaceLetters(word);
        } else {
            return word;
        }
    }

    private String getLetterReplacement(String previousLetter, String currentLetter) {
        if (isVowel(previousLetter) && isVowel(currentLetter)) {
            return "";
        } else if (isVowel(currentLetter)) {
            return OUTPUT_WORD;
        } else {
            return currentLetter;
        }
    };

    private String replaceLetters(String word) {
        String result = "";
        String previous = "";

        for (String letter : word.split("")) {
            result += getLetterReplacement(previous,letter);
            previous = letter;
        }
        return result;
    };

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
        return Math.round(count / word.length()) > THRESHOLD;
    }
}
