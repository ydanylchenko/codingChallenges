import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CharProblem {
    public static int howOld(final String herOld) {
//        Character.getNumericValue(herOld.charAt(0))
        return Character.getNumericValue(herOld.charAt(0));
//        return Integer.valueOf(herOld.subSequence(0,1).toString());

    }
    @Test
    public void test1() {
        assertEquals(5, CharProblem.howOld("5 years old"));
    }
    @Test
    public void test2() {
        assertEquals(9, CharProblem.howOld("9 years old"));
    }
    @Test
    public void test3() {
        assertEquals(1, CharProblem.howOld("1 year old"));
    }
}
