import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;


public class EvenNumbers {
    public static int[] divisibleBy1(int[] numbers, long divider) {
        ArrayList<Integer> results = new ArrayList<Integer>();
        for (int number : numbers) {
            if (number % divider == 0) {
                results.add(number);
            }
        }
        int[] intResults = new int[results.size()];
        for (int i = 0; i < results.size(); i++) {
            intResults[i] = results.get(i);
        }
        return intResults;
    }

    public static int[] divisibleBy(int[] numbers, long divider) {
        return Arrays.stream(numbers).filter(i -> (i % divider) == 0).toArray();
    }

    @Test
    public void testSimple() {
        assertTrue(Arrays.equals(new int[]{2, 4, 6}, EvenNumbers.divisibleBy(new int[]{7, 1, 2, 3, 4, 5, 6}, 2)));
        assertTrue(Arrays.equals(new int[]{3, 6}, EvenNumbers.divisibleBy(new int[]{1, 2, 3, 4, 5, 6}, 3)));
        assertTrue(Arrays.equals(new int[]{0, 4}, EvenNumbers.divisibleBy(new int[]{0, 1, 2, 3, 4, 5, 6}, 4)));
    }
}
