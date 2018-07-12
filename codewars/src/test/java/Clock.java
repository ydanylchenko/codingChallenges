import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Clock {
    public static int Past(int h, int m, int s) {
        return 1000 * (h * 60 * 60 + m * 60 + s);
    }

    @Test
    public void test1() {

        assertEquals(Clock.Past(0, 1, 1), 61000);
    }
}