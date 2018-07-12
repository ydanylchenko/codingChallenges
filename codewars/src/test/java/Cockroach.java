import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Cockroach {
    public int cockroachSpeed(double x) {
//        return new Double(x*1000/36).intValue();
        return (int) (x*100000/3600);
    }

    @Test
    public void basicTests() throws Exception {
        Cockroach cockroach = new Cockroach();
        assertEquals(30, cockroach.cockroachSpeed(1.08));
        assertEquals(30, cockroach.cockroachSpeed(1.09));
        assertEquals(0, cockroach.cockroachSpeed(0));
    }
}