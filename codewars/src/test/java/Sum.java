import org.junit.Test;

import java.util.stream.IntStream;

import static org.junit.Assert.assertEquals;

public class Sum {

    public static int arrayPlusArray(int[] arr1, int[] arr2) {
        return IntStream.of(arr1).sum() + IntStream.of(arr2).sum();
    }

    @Test
    public void sampleTests() {
        assertEquals(21, Sum.arrayPlusArray(new int[]{1, 2, 3}, new int[]{4, 5, 6}));
        assertEquals(-21, Sum.arrayPlusArray(new int[]{-1, -2, -3}, new int[]{-4, -5, -6}));
        assertEquals(15, Sum.arrayPlusArray(new int[]{0, 0, 0}, new int[]{4, 5, 6}));
        assertEquals(2100, Sum.arrayPlusArray(new int[]{100, 200, 300}, new int[]{400, 500, 600}));
    }

}
