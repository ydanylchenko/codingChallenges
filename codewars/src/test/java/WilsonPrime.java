import org.junit.Test;

import java.util.stream.IntStream;

import static org.junit.Assert.assertEquals;

public class WilsonPrime {
    public static boolean am_i_wilson(double n) {
        int[] factorialDigits = IntStream.range(1, (int) n).toArray();
        int factorial = 1;
        for (int factorialDigit : factorialDigits) {
            factorial*=factorialDigit;
        }
        double a = (factorial + 1.0) /(n * n);
        return (factorial + 1) /(n * n) % 1 == 0;
    }

    @Test
    public void test1() {
        assertEquals(true, WilsonPrime.am_i_wilson(5));
        assertEquals(true, WilsonPrime.am_i_wilson(13));
        assertEquals(true, WilsonPrime.am_i_wilson(563));
        assertEquals(false, WilsonPrime.am_i_wilson(0));
        assertEquals(false, WilsonPrime.am_i_wilson(1));
    }
}