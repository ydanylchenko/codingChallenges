import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class TipCalculator {
    private static final HashMap<String, Double> TIPS = new HashMap<>();

    static {
        TIPS.put("terrible", 0.0);
        TIPS.put("poor", 0.05);
        TIPS.put("good", 0.10);
        TIPS.put("great", 0.15);
        TIPS.put("excellent", 0.20);
    }

    public static Integer calculateTip(double amount, String rating) {
        return TIPS.containsKey(rating.toLowerCase()) ? (int) Math.ceil(TIPS.get(rating.toLowerCase()) * amount) : null;
    }

    @Test
    public void test1() {
        assertEquals(new Integer(2), TipCalculator.calculateTip(30d, "poor"));
        assertEquals(new Integer(4), TipCalculator.calculateTip(20d, "Excellent"));
        assertNull(TipCalculator.calculateTip(20d, "hi"));
        assertEquals(new Integer(17), TipCalculator.calculateTip(107.65, "GReat"));
    }
}