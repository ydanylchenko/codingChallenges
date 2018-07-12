import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReversedStrings {
    public static String solution(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    @Test
    public void sampleTests() {
        assertEquals("dlrow", solution("world"));
    }
}
