import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AgeDiff {
    public static String calculateAge(int birth, int yearTo) {
        int diff = yearTo - birth;
        if (diff < -1) {
            return String.format("You will be born in %s years.", Math.abs(diff));
        } else if (diff == -1) {
            return String.format("You will be born in %s year.", Math.abs(diff));
        } else if (diff == 0) {
            return "You were born this very year!";
        } else if (diff == 1) {
            return String.format("You are %s year old.", diff);
        } else {
            return String.format("You are %s years old.", diff);
        }
    }

    @Test
    public void testAge() {
        assertEquals("You are 4 years old.", calculateAge(2012, 2016));
        assertEquals("You are 27 years old.", calculateAge(1989, 2016));
        assertEquals("You are 90 years old.", calculateAge(2000, 2090));
        assertEquals("You will be born in 10 years.", calculateAge(2000, 1990));
        assertEquals("You were born this very year!", calculateAge(3400, 3400));
        assertEquals("You are 2000 years old.", calculateAge(900, 2900));
        assertEquals("You will be born in 110 years.", calculateAge(2010, 1900));
        assertEquals("You will be born in 510 years.", calculateAge(2010, 1500));
        assertEquals("You are 1 year old.", calculateAge(2011, 2012));
        assertEquals("You will be born in 1 year.", calculateAge(2000, 1999));
    }
}
