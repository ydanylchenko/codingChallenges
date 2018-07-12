import org.junit.Test;

import java.util.Arrays;
import java.util.Objects;

import static org.junit.Assert.assertEquals;

public class Counter {
    public int countSheeps(Boolean[] arrayOfSheeps) {
        return new Long(Arrays.stream(arrayOfSheeps).filter(Objects::nonNull).filter(Boolean::booleanValue).count()).intValue();
    }

    Boolean[] array1 = {true, true, true, false,
            true, true, true, true,
            true, false, true, null,
            true, false, false, true,
            true, true, true, true,
            false, false, true, true};

    @Test
    public void test() {
        assertEquals("There are 17 sheeps in total", 17, new Counter().countSheeps(array1));
    }
}