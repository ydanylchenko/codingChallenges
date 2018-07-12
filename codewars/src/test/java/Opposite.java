import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Opposite {
    public static int opposite(int number) {
        return -1 * number;

    }

    @Test
    public void tests() {
        assertEquals(-5, opposite(5));
    }
}
