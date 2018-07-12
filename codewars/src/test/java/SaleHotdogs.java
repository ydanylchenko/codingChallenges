import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SaleHotdogs {
    public static int saleHotdogs(final int n) {
        int price;
        if (n < 5) {
            price = 100;
        } else if (n < 10) {
            price = 95;
        } else {
            price = 90;
        }
        return n * price;
    }

    @Test
    public void BasicTests() {
        assertEquals(100, SaleHotdogs.saleHotdogs(1));
        assertEquals(400, SaleHotdogs.saleHotdogs(4));
        assertEquals(475, SaleHotdogs.saleHotdogs(5));
        assertEquals(855, SaleHotdogs.saleHotdogs(9));
        assertEquals(900, SaleHotdogs.saleHotdogs(10));
        assertEquals(9000, SaleHotdogs.saleHotdogs(100));
    }
}