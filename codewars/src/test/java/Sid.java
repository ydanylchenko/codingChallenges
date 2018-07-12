import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Sid {
    public static String howMuchILoveYou(int nb_petals) {
        String[] words = new String[]{"not at all", "I love you", "a little", "a lot", "passionately", "madly"};
        return words[nb_petals % words.length];
    }

    @Test
    public void test1() {
        assertEquals("I love you", Sid.howMuchILoveYou(1));
        assertEquals("a little", Sid.howMuchILoveYou(2));
        assertEquals("not at all", Sid.howMuchILoveYou(6));
        assertEquals("not at all", Sid.howMuchILoveYou(42));
        assertEquals("not at all", Sid.howMuchILoveYou(0));
    }
}