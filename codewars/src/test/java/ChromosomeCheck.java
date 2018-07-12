import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ChromosomeCheck {
    public static String chromosomeCheck(String sperm) {
        return sperm.contains("Y") ? "Congratulations! You're going to have a son." : "Congratulations! You're going to have a daughter.";
    }

    @Test
    public void tests() {
        assertEquals("Congratulations! You're going to have a son.", chromosomeCheck("XY"));
        assertEquals("Congratulations! You're going to have a daughter.", chromosomeCheck("XX"));
    }
}
