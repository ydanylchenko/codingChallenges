import org.junit.Test;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.Assert.assertEquals;

public class TripleTrouble {
    public static String tripleTrouble(String one, String two, String three) {
        return IntStream.range(0, one.length())
                .mapToObj(value -> new char[]{one.charAt(value),two.charAt(value),three.charAt(value)})
                .map(String::valueOf)
                .collect(Collectors.joining());
    }

    @Test
    public void tests() {
        assertEquals("ttlheoiscstk", tripleTrouble("this", "test", "lock"));
        assertEquals("abcabc", tripleTrouble("aa", "bb", "cc"));
        assertEquals("Batman", tripleTrouble("Bm", "aa", "tn"));
        assertEquals("LexLuthor", tripleTrouble("LLh", "euo", "xtr"));
    }
}