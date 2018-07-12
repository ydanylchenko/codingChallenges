import org.junit.Test;

import java.util.Collections;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;

public class StringRepeat {
    public static String repeatStr(final int repeat, final String string) {
        return repeat >= 0 ? Collections.nCopies(repeat, string).stream().collect(Collectors.joining()) : "";
    }

    @Test
    public void test4a() {
        assertEquals("aaaa", repeatStr(4, "a"));
        assertEquals("HelloHelloHello", repeatStr(3, "Hello"));
        assertEquals("", repeatStr(5, ""));
        assertEquals("", repeatStr(0, "kata"));
        assertEquals("", repeatStr(-10, "kata"));
    }
}
