import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DatingRange {
    public static String datingRange(int age) {
        int min;
        int max;
        if (age >= 14) {
            min = new Double(age / 2d + 7).intValue();
            max = (age - 7) * 2;
        } else {
            min = new Double(age - age / 10d).intValue();
            max = new Double(age + age / 10d).intValue();
        }
        return String.format("%s-%s", min, max);
    }

    @Test
    public void exampleTests() {
        assertEquals("15-20", datingRange(17));
        assertEquals("27-66", datingRange(40));
        assertEquals("14-16", datingRange(15));
        assertEquals("24-56", datingRange(35));
        assertEquals("9-11", datingRange(10));
        assertEquals("0-1", datingRange(1));
        assertEquals("10-13", datingRange(12));
    }


}
