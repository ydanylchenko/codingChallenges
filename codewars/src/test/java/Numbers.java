import org.junit.Test;

import java.text.DecimalFormat;

import static org.junit.Assert.assertEquals;

public class Numbers {
    public static double TwoDecimalPlaces(double number) {
        //Write your code here
        return new Double(String.format("%.2f", number));
    }

    @Test
    public void Test_01() {
        assertEquals(4.66, Numbers.TwoDecimalPlaces(4.659725356), 0.00);
        assertEquals(173735326.38, Numbers.TwoDecimalPlaces(173735326.3783732637948948), 0.00);
        assertEquals(2.68, Numbers.TwoDecimalPlaces(2.675), 0.00);
    }
}