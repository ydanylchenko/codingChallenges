import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Plural {
    public static boolean isPlural(float f) {
        return f < 1f;
    }

    @Test
    public void BasicTest() {
        assertEquals(true, Plural.isPlural(0f));
        assertEquals(true, Plural.isPlural(0.5f));
        assertEquals(false, Plural.isPlural(1f));
        assertEquals(true, Plural.isPlural(100f));
    }
}