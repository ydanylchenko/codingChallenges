import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RemoveChars {
    public static String remove(String str) {
        return str.substring(1, str.length() - 1);
    }

    @Test
    public void testRemoval() {
        assertEquals("loquen", RemoveChars.remove("eloquent"));
        assertEquals("ountr", RemoveChars.remove("country"));
        assertEquals("erso", RemoveChars.remove("person"));
        assertEquals("lac", RemoveChars.remove("place"));
    }
}
