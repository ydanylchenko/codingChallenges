import com.sun.javafx.binding.StringFormatter;
import org.junit.Test;

import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.Assert.assertEquals;

public class RepeatIt {

    public static String repeatString(final Object toRepeat, final int n) {
//        return toRepeat instanceof String ? Collections.nCopies(n, String.valueOf(toRepeat)).stream().collect(Collectors.joining()) : "Not a string";
        return toRepeat instanceof String ? Collections.nCopies(n, toRepeat).stream().map(String::valueOf).collect(Collectors.joining()) : "Not a string";
    }


    @Test
    public void testStar() {
        repeatTest("*", 3, "***");
    }

    @Test
    public void testHello() {
        repeatTest("Hello", 11, "HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHello");
    }

    public void repeatTest(final Object toRepeat, final int n, final String expected) {
        final String testMessage = String.format("Testing with toRepeat = %s and n = %d", toRepeat, n);
        assertEquals(testMessage, expected, RepeatIt.repeatString(toRepeat, n));
    }
}