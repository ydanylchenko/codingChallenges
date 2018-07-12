import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NoBoring {
    public static int noBoringZeros(int n) {
        return (n != 0 && n % 10 == 0) ? noBoringZeros(n / 10) : n;
    }

    @Test
    public void test1() {
        System.out.println("Fixed Tests: noBoringZeros");
        testing(NoBoring.noBoringZeros(1450), 145);
        testing(NoBoring.noBoringZeros(960000), 96);
        testing(NoBoring.noBoringZeros(1050), 105);
        testing(NoBoring.noBoringZeros(-1050), -105);
        testing(NoBoring.noBoringZeros(0), 0);
    }

    private static void testing(int actual, int expected) {
        assertEquals(expected, actual);
    }
}