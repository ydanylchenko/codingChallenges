import org.junit.Test;

import java.util.Collections;
import java.util.stream.IntStream;

import static org.junit.Assert.assertEquals;

public class FirstNonConsecutive {
    //    static Integer find(final int[] array) {
//        Integer firstNonConsecutive = null;
//        for (int i = 1; i < array.length; i++) {
//            if (array[i] - array[i - 1] > 1) {
//                firstNonConsecutive = array[i];
//                break;
//            }
//        }
//        return firstNonConsecutive;
//    }
    static Integer find(final int[] array) {
        return IntStream.range(0, array.length - 1)
                .mapToObj(i -> new int[]{array[i], array[i + 1]})
                .filter(e -> e[1] - e[0] > 1)
                .map(e -> e[1])
                .findFirst().orElse(null);
    }

    @Test
    public void basicTests() {
        assertEquals(Integer.valueOf(6), FirstNonConsecutive.find(new int[]{1, 2, 3, 4, 6, 7, 8}));
        assertEquals(null, FirstNonConsecutive.find(new int[]{1, 2, 3, 4, 5, 6, 7, 8}));
        assertEquals(Integer.valueOf(6), FirstNonConsecutive.find(new int[]{4, 6, 7, 8, 9, 11}));
        assertEquals(Integer.valueOf(11), FirstNonConsecutive.find(new int[]{4, 5, 6, 7, 8, 9, 11}));
        assertEquals(null, FirstNonConsecutive.find(new int[]{31, 32}));
        assertEquals(Integer.valueOf(0), FirstNonConsecutive.find(new int[]{-3, -2, 0, 1}));
        assertEquals(Integer.valueOf(-1), FirstNonConsecutive.find(new int[]{-5, -4, -3, -1}));
    }
}
