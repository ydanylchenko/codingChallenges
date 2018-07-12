import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class Positive {

    public static int sum(int[] arr) {
        return Arrays.stream(arr).filter(value -> value > 0).sum();
    }

    @Test
    public void testSomething() {
        assertEquals(15, Positive.sum(new int[]{1, 2, 3, 4, 5}));
        assertEquals(13, Positive.sum(new int[]{1, -2, 3, 4, 5}));
        assertEquals(0, Positive.sum(new int[]{}));
        assertEquals(0, Positive.sum(new int[]{-1, -2, -3, -4, -5}));
        assertEquals(9, Positive.sum(new int[]{-1, 2, 3, 4, -5}));
    }
}
