import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class GetSize {
    public static int[] getSize(int w, int h, int d) {
        return new int[]{(w * h + w * d + h * d) * 2, w * h * d};
    }

    @Test
    public void test1() {
        Kata k = new Kata();

        assertArrayEquals(new int[]{88, 48}, getSize(4, 2, 6));
        assertArrayEquals(new int[]{6, 1}, getSize(1, 1, 1));
        assertArrayEquals(new int[]{10, 2}, getSize(1, 2, 1));
        assertArrayEquals(new int[]{16, 4}, getSize(1, 2, 2));
        assertArrayEquals(new int[]{600, 1000}, getSize(10, 10, 10));
    }
}
