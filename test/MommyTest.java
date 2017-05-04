import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class MommyTest {

    @Test
    public void shouldNotMommyEmtpyString() {
        Mommy mommy = new Mommy();

        assertEquals("", mommy.mommy(""));
    }

    @Test
    public void shouldMommyASingleVowel() {
        Mommy mommy = new Mommy();

        assertEquals("mommy", mommy.mommy("a"));
        assertEquals("mommy", mommy.mommy("e"));
        assertEquals("mommy", mommy.mommy("i"));
        assertEquals("mommy", mommy.mommy("o"));
        assertEquals("mommy", mommy.mommy("u"));
    }

    @Test
    public void shouldNotMommyASingleNonVowelLetter() {
        Mommy mommy = new Mommy();

        assertEquals("c", mommy.mommy("c"));
    }

    @Test
    public void shouldOnlyMommySingleTimeWhenHaveOneMoreThanOneVowel() {
        Mommy mommy = new Mommy();

        assertEquals("mommy", mommy.mommy("aeiou"));
    }

    @Test
    public void shouldDetermineIfVowelsAreGreaterThanOneThirdOfStringLength() {
        Mommy mommy = new Mommy();

        assertFalse(mommy.vowelsGreaterThanOneThird("his"));
        assertTrue(mommy.vowelsGreaterThanOneThird("hear"));
    }

    @Test
    public void shouldNotMommyWordWhenVowelIsEqualToOneThirdTheLengthOfString() {
        Mommy mommy = new Mommy();

        assertEquals("his", mommy.mommy("his"));
    }
}
