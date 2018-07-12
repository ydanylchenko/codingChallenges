import org.junit.Test;

import java.util.stream.IntStream;

import static org.junit.Assert.assertEquals;

public class GrassHopper {

    public static String weatherInfo(int temp) {
        double c = convertToCelsius(temp);
        if (c < 0)
            return (c + " is freezing temperature");
        else
            return (c + " is above freezing temperature");
    }

    public static double convertToCelsius(int temperature) {
        return (temperature - 32d) * 5d / 9d;
    }

    @Test
    public void testA() {
        assertEquals("13.333333333333334 is above freezing temperature", GrassHopper.weatherInfo(56));
        assertEquals("10.0 is above freezing temperature", GrassHopper.weatherInfo(50));
        assertEquals("-5.0 is freezing temperature", GrassHopper.weatherInfo(23));
    }

    public static int findAverage(int[] nums) {
        return (int)IntStream.of(nums).average().orElse(0);
    }
}
