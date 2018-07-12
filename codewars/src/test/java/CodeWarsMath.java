import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CodeWarsMath {
    public static int nearestSq(final int n) {
        double sqrt = Math.sqrt(n);
        int lower = (int) Math.pow(new Double(sqrt).intValue(), 2);
        int upper = (int) Math.pow(new Double(sqrt).intValue() + 1, 2);
        return (n - lower < upper - n) ? lower : upper;
    }

    @Test
    public void basicTests() {
        assertEquals(1, CodeWarsMath.nearestSq(1));
        assertEquals(1, CodeWarsMath.nearestSq(2));
        assertEquals(9, CodeWarsMath.nearestSq(10));
        assertEquals(121, CodeWarsMath.nearestSq(111));
        assertEquals(10000, CodeWarsMath.nearestSq(9999));
    }
}