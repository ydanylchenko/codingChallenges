import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrafficLights {

    public static String updateLight(String current) {
        switch (current) {
            case "green":
                return "yellow";
            case "yellow":
                return "red";
            default:
                return "green";
        }
    }

    @Test
    public void update_light() {
        assertEquals("green", TrafficLights.updateLight("red"));
        assertEquals("yellow", TrafficLights.updateLight("green"));
        assertEquals("red", TrafficLights.updateLight("yellow"));
    }

}