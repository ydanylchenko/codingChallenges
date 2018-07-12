import static org.junit.Assert.*;

import org.junit.Test;

public class DivisibleNb {
    public static boolean isDivisible(long n, long x, long y) {
        return n % x == 0 && n % y == 0;
    }


    @Test
    public void test1() {
        assertEquals(true, DivisibleNb.isDivisible(12, 4, 3));
    }

    @Test
    public void test2() {
        assertEquals(false, DivisibleNb.isDivisible(3, 3, 4));
    }

}

