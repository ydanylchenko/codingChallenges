import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class Converter {
    private static final double LITERS_IN_GALLON = 4.54609188;
    private static final double KILOMETERS_IN_MILE = 1.609344;

    public static float mpgToKPM(final float mpg) {
//        return new Float(String.format("%.2f", mpg * KILOMETERS_IN_MILE / LITERS_IN_GALLON));
        return BigDecimal.valueOf(mpg * KILOMETERS_IN_MILE / LITERS_IN_GALLON).setScale(2, BigDecimal.ROUND_HALF_UP).floatValue();
    }

    @Test
    public void test1() {
        assertEquals(3.54f, Converter.mpgToKPM(10), 0.001f);
        assertEquals(7.08f, Converter.mpgToKPM(20), 0.001f);
        assertEquals(10.62f, Converter.mpgToKPM(30), 0.001f);
    }
}