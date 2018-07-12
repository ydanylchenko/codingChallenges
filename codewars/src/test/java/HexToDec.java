import org.junit.Test;

import java.text.DecimalFormat;

import static org.junit.Assert.assertEquals;

public class HexToDec {

    public static int hexToDec(final String hexString) {
//        int intString =
//        DecimalFormat decimalFormat = new DecimalFormat();
//        decimalFormat.parse(hexString, );
        return Integer.valueOf(hexString, 16);
    }

    @Test
    public void examples() {
        // assertEquals("expected", "actual");
        assertEquals(1, hexToDec("1"));
        assertEquals(10, hexToDec("a"));
        assertEquals(16, hexToDec("10"));
        assertEquals(255, hexToDec("FF"));
        assertEquals(-12, hexToDec("-C"));
    }
}
