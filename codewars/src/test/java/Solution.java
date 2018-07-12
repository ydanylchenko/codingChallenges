import org.junit.Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

public class Solution {

    public static int numberOfRectangles(int m, int n) {
        // Your code here!
        try {
            System.out.println("try");
            throw new IOException("asdas");
        } catch (IOException e) {
            System.out.println("catch");
            return 1;
        } finally {
            System.out.println("finally");
        }
//        return 2;
    }


    @Test
    public void shouldWorkWith4x4() {
        System.out.println("Start");
        System.out.println(Solution.numberOfRectangles(4, 4));
        System.out.println("end");
    }

    @Test
    public void shouldWorkWith5x5() {
        assertEquals("225", 225, Solution.numberOfRectangles(5, 5), 0);
    }


    public static String balancedNum(long number) {
//        middle = number.
        int middle = (int) Math.floor(String.valueOf(number).length() / 2d);
        IntSummaryStatistics statistics = Arrays.stream(new int[]{0, 1}).mapToObj(object -> String.valueOf(number).substring(object * middle + object, middle + object * middle + object)).map(s -> (Arrays.stream(s.split("")).map(Integer::valueOf)).mapToInt(Integer::intValue).sum()).mapToInt(Integer::intValue).summaryStatistics();
//        Stream<String> stream = Arrays.stream(new int[]{0, 1}).mapToObj(object -> String.valueOf(number).substring(object * middle + object, middle + object * middle + object));
//        stream.map(s -> (Arrays.stream(s.split("")).map(Integer::valueOf)).mapToInt(Integer::intValue).sum()).toArray();
        return statistics.getMax() == statistics.getMin() ? "Balanced" : "Not Balanced";
    }

    @Test
    public void Check_Balanced_Number() {
//        assertEquals("Balanced", Solution.balancedNum(7));
        assertEquals("Balanced", Solution.balancedNum(1295921));
        assertEquals("Balanced", Solution.balancedNum(13));
        assertEquals("Not Balanced", Solution.balancedNum(432));
        assertEquals("Balanced", Solution.balancedNum(424));
    }

    @Test
    public void Check_Larger_Number() {
        assertEquals("Not Balanced", Solution.balancedNum(1024));
        assertEquals("Not Balanced", Solution.balancedNum(66545));
        assertEquals("Not Balanced", Solution.balancedNum(295591));
        assertEquals("Not Balanced", Solution.balancedNum(1230987));
        assertEquals("Balanced", Solution.balancedNum(56239814));
    }
}