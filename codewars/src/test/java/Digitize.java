import org.junit.Test;

import java.util.Collections;
import java.util.LinkedList;
import java.util.stream.Collectors;

import static org.junit.Assert.assertArrayEquals;

public class Digitize {
    public static int[] digitize(long n) {
        LinkedList<Integer> integers = Long.toString(n).chars().map(Character::getNumericValue).boxed().collect(Collectors.toCollection(LinkedList::new));
        Collections.reverse(integers);
        return integers.stream().mapToInt(Integer::intValue).toArray();
    }
//    public static int[] digitize(long n) {
//        String value = Long.toString(n);
//        LinkedList<Integer> aaa = Stream.of(value.split("")).mapToInt(Integer::valueOf).boxed().collect(Collectors.toCollection(LinkedList::new));
//        Collections.reverse(aaa);
//        return aaa.stream().mapToInt(Integer::intValue).toArray();
//    }

    @Test
    public void tests() {
        assertArrayEquals(new int[]{1, 3, 2, 5, 3}, digitize(35231));
    }
}
