import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.assertEquals;

public class PythagoreanTriple {

    public int pythagoreanTriple(int[] triple) {
        Arrays.sort(triple);
        return triple[2] * triple[2] == triple[0] * triple[0] + triple[1] * triple[1] ? 1 : 0;
    }

    static int[] p1 = {3, 5, 4};
    static int[] p2 = {3, 5, 7};


    @Test
    public void validTriple() {
        PythagoreanTriple pT = new PythagoreanTriple();
        assertEquals(1, pT.pythagoreanTriple(p1));
        assertEquals(0, pT.pythagoreanTriple(p2));
    }
}
