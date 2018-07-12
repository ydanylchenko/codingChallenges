import org.junit.Test;

import java.util.stream.IntStream;

import static org.junit.Assert.assertArrayEquals;

public class Sequence {

    public static int[] reverse(int n) {
//        int[] output = new int[n];
//        for (int i = 0; i < n; i++) {
//            output[i] = n - i;
//        }
//        return output;
        return IntStream.range(-n, 0).map(Math::abs).toArray();
    }

    @Test
    public void simpleTest() {
        assertArrayEquals(new int[]{5, 4, 3, 2, 1}, Sequence.reverse(5));
    }
}