import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KeepHydrated {

    public int Liters(double time) {
        return new Double(time * 0.5d).intValue();
    }

    @Test
    public void SampleTest1() {
        KeepHydrated kh = new KeepHydrated();
        assertEquals(1, kh.Liters(2));
        assertEquals(0, kh.Liters(0.97));
        assertEquals(7, kh.Liters(14.64));
        assertEquals(800, kh.Liters(1600.20));
        assertEquals(40, kh.Liters(80));
    }

    public static int noBoringZeros(int n) {
        return removeZeros(n);
    }

    private static int removeZeros(int n) {
        return n % 10 == 0 ? removeZeros(n) : n;
    }
}