import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MommyficadoTest {
    @Test

    public void shouldNotMommyficarEmtpyString() {
        Mommy mommy = new Mommy();

        assertEquals("", mommy.mommyficar(""));
    }

    @Test
    public void shuldMommyficarASingleVowel() throws Exception {
        Mommy mommy = new Mommy();

        assertEquals("mommy", mommy.mommyficar("a"));
        assertEquals("mommy", mommy.mommyficar("e"));
        assertEquals("mommy", mommy.mommyficar("i"));
        assertEquals("mommy", mommy.mommyficar("o"));
        assertEquals("mommy", mommy.mommyficar("u"));
    }

    @Test

    public void shouldNotMommyficarASingleNonVowelLetter() {
        Mommy mommy = new Mommy();

        assertEquals("c", mommy.mommyficar("c"));
    }

    @Test
    public void shouldOnlyMommyficarSingleTimeWhenHaveOneMoreThanOneVowel() throws Exception {
        Mommy mommy = new Mommy();

        assertEquals("mommy", mommy.mommyficar("aeiou"));
    }
}
