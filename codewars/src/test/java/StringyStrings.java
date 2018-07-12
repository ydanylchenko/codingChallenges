import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertEquals;

public class StringyStrings {
    public static String stringy(int size) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < size; i++) {
            if (i % 2 == 0) {
                builder.append(1);
            } else {
                builder.append(0);
            }
        }
        return builder.toString();
    }

    @Test
    public void startTest() {
        assertEquals("Your string should start with a 1", '1', stringy(3).charAt(0));
    }

    @Test
    public void lengthTests() {
        Random randGen = new Random();
        for (int i = 0; i < 10; i++) {
            int size = randGen.nextInt(50);
            assertEquals("Wrong length using size " + size, size, stringy(size).length());
        }
    }
}
