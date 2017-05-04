import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by bsayler on 5/4/17.
 */
public class Mommy {
    public String mommyficar(String word) {
        List<String> vowelList = Arrays.asList("a", "e", "i", "o", "u");

        if (vowelList.contains(word)) {
            return "mommy";
        } else {
            return word;
        }

    }
}
