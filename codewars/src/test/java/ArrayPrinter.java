import org.junit.Test;

import java.util.Arrays;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;

public class ArrayPrinter {

    public static String printArray(Object array[]) {
        return Arrays.stream(array).map(String::valueOf).collect(Collectors.joining(","));
    }

    @Test
    public void testInteger() {
        Integer[] array = new Integer[]{2, 4, 5, 2};
        assertEquals("2,4,5,2", ArrayPrinter.printArray(array));
    }
}