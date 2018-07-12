import org.junit.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class Barycenter {

    public static double[] barTriang1(double[] x, double[] y, double[] z) {
        float x0 = new BigDecimal(((x[0] + y[0] + z[0]) / 3)).setScale(4, RoundingMode.CEILING).floatValue();
        float y0 = new BigDecimal(((x[1] + y[1] + z[1]) / 3)).setScale(4, RoundingMode.CEILING).floatValue();
        return new double[]{x0, y0};
    }

    public static double[] barTriang(double[] x, double[] y, double[] z) {
        double x0 = new BigDecimal(((x[0] + y[0] + z[0]) / 3)).setScale(4, RoundingMode.HALF_UP).doubleValue();
        double y0 = new BigDecimal(((x[1] + y[1] + z[1]) / 3)).setScale(4, RoundingMode.HALF_UP).doubleValue();
        return new double[]{x0, y0};
    }

    @Test
    public void test() {
        System.out.println("Fixed Tests");
        assertEquals("[8.6667, 6.6667]", Arrays.toString(Barycenter.barTriang(
                new double[]{4, 6}, new double[]{12, 4}, new double[]{10, 10})));
        assertEquals("[7.3333, 4.6667]", Arrays.toString(Barycenter.barTriang(
                new double[]{4, 2}, new double[]{12, 2}, new double[]{6, 10})));

    }
}