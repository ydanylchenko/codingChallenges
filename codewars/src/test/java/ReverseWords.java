import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;

public class ReverseWords {

    public static String reverseWords_0(String str) {
        List<String> strings = Arrays.stream(str.split("\\s")).collect(Collectors.toList());
        Collections.reverse(strings);
        return strings.stream().collect(Collectors.joining(" "));
    }

    public static String reverseWords(String str) {
        List Words = Arrays.asList(str.split(" "));
        Collections.reverse(Words);
        return String.join(" ", Words);
    }

    @Test
    public void testSomething() {
        assertEquals("eating like I", ReverseWords.reverseWords("I like eating"));
        assertEquals("flying like I", ReverseWords.reverseWords("I like flying"));
        assertEquals("nice is world The", ReverseWords.reverseWords("The world is nice"));
    }
}
