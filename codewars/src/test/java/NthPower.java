import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NthPower {
    public static int nthPower(int[] array, int n) {
        return array.length > n ? new Double(Math.pow(array[n], n)).intValue() : -1;
    }

    @Test
    public void basicTests() {
        assertEquals(-1, nthPower(new int[]{1, 2}, 2));
        assertEquals(8, nthPower(new int[]{3, 1, 2, 2}, 3));
        assertEquals(4, nthPower(new int[]{3, 1, 2}, 2));
    }
}
