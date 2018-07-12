import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;

public class SumDigPower {

//    public static List<Long> sumDigPow(long a, long b) {
//        List<Long> digits = new ArrayList<>();
//        for (long digit = a; digit <= b; digit++) {
//            long[] intTab = String.valueOf(a).chars().map(Character::getNumericValue).map(Long::valueOf).toArray();
//            int sum = 0;
//            for (int i : intTab) {
//                for (int j = 1; j <= intTab.length; j++) {
//                    sum += Math.pow(digit, 1l);
//                }
//            }
//            if (sum == a){
//                digits.add(a);
//            }
//        }
//            if sum==
//            List<char[]> digitsArrau = Arrays.stream({}).collect(Collectors.toCollection(ArrayList::new));
//            char[] chars = Arrays.spliterator();
//                for (char character : chars) {
//
//                }
//            if (i.toString().length() > 1) {
//                digits.add(i);
//            }
//        return digits;
//    }
//
//    @Test
//    public void test() {
//        System.out.println("Basic Tests");
//        testing(88, 90, new long[]{89});
//        testing(1, 10, new long[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
//        testing(1, 100, new long[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 89});
//        testing(10, 100, new long[]{89});
//        testing(90, 100, new long[]{});
//        testing(90, 150, new long[]{135});
//        testing(50, 150, new long[]{89, 135});
//        testing(10, 150, new long[]{89, 135});
//    }
//
//    private static void testing(long a, long b, long[] res) {
//        assertEquals(Arrays.toString(res),
//                Arrays.toString(SumDigPower.sumDigPow(a, b).toArray()));
//    }
}
