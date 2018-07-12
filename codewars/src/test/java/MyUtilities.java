import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyUtilities {

    public boolean isDigit(String s) {
        try {
            Float.parseFloat(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }


    @Test
    public void test0() throws Exception {
        MyUtilities myUtil = new MyUtilities();
        assertEquals(true, myUtil.isDigit("-234.4"));
        assertEquals(false, myUtil.isDigit("s2324"));
    }

}