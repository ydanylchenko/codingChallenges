import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class School {

    public static int getAverage(int[] marks) {
        return new Double(Arrays.stream(marks).average().getAsDouble()).intValue();
    }

    @Test
    public void simpleTest() {
        assertEquals(1, School.getAverage(new int[]{2, 2, 1}));
        assertEquals(2, School.getAverage(new int[]{2, 2, 2, 2}));
        assertEquals(3, School.getAverage(new int[]{1, 2, 3, 4, 5}));
        assertEquals(1, School.getAverage(new int[]{1, 1, 1, 1, 1, 1, 1, 2}));
    }
}
