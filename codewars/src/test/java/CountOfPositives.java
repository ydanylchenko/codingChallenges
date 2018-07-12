import org.junit.Test;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static org.junit.Assert.assertArrayEquals;

public class CountOfPositives {
    public static int[] countPositivesSumNegatives(int[] input) {
        int[] output;
        if (input == null || input.length == 0) {
            output = new int[0];
        } else {
            int positives = (int) Arrays.stream(input).filter(operand -> operand > 0).count();
            int negativesSum = Arrays.stream(input).filter(operand -> operand <= 0).sum();
            output = new int[]{positives, negativesSum};
        }
        return output;
    }

    @Test
    public void countPositivesSumNegatives_BasicTest() {
        int[] expectedResult = new int[]{10, -65};
        assertArrayEquals(expectedResult, countPositivesSumNegatives(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15}));
    }

    @Test
    public void countPositivesSumNegatives_InputWithZeroes() {
        int[] expectedResult = new int[]{8, -50};
        assertArrayEquals(expectedResult, countPositivesSumNegatives(new int[]{0, 2, 3, 0, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14}));
    }
}