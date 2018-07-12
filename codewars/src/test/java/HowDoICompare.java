import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HowDoICompare {
    public static String whatIs(Integer x) {
        for (Object[] p : specialNumbers) {
            if (x == (int) (p[0])) {
                return (String) p[1];
            } else if (Math.pow(x, 2) == (int) (p[0])) {
                return "everything";
            }
        }
        return "nothing";
    }

    private static final Object[][] specialNumbers = {
            {42, "everything"},
            {42 * 42, "everything squared"},
    };

    @Test
    public void test() throws Exception {
        for (Object[] t : specialNumbers)
            assertEquals(t[1], HowDoICompare.whatIs((Integer) t[0]));
    }

    static final Object[][] tests = {
            {0, "nothing"},
            {123, "nothing"},
            {-1, "nothing"},
            {42, "everything"},
            {42 * 42, "everything squared"},
    };
}