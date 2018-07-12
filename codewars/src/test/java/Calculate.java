import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Calculate {
    public static String bmi(double weight, double height) {
        double bmi = weight / Math.pow(height, 2);
        if (bmi <= 18.5)
            return "Underweight";
        else if (bmi <= 25.0)
            return "Normal";
        else if (bmi <= 30.0)
            return "Overweight";
        else
            return "Obese";
    }

    @Test
    public void testBMI() {
        assertEquals("Normal", Calculate.bmi(80, 1.80));
    }
}