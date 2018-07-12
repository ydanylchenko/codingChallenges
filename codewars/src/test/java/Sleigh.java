import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Sleigh {
    public static Boolean authenticate(String name, String password) {
        return name.equals("Santa Claus") && password.equals("Ho Ho Ho!");
    }

    @Test
    public void test_authentication() {
        assertEquals(true, Sleigh.authenticate("Santa Claus", "Ho Ho Ho!"));
        assertEquals(false, Sleigh.authenticate("Santa", "Ho Ho Ho!"));
        assertEquals(false, Sleigh.authenticate("Santa Claus", "Ho Ho Ho"));
    }
}
