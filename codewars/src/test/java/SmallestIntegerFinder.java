import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class SmallestIntegerFinder {
    public static int findSmallestInt(int[] args) {
        return Arrays.stream(args).min().getAsInt();
    }

    @Test
    public void example1() {
        int expected = 11;
        int actual = SmallestIntegerFinder.findSmallestInt(new int[]{78, 56, 232, 12, 11, 43});
        assertEquals(expected, actual);
    }
}