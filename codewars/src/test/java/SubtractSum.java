import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

import static org.junit.Assert.assertEquals;

public class SubtractSum {

    private static final Map<Integer, String> fruits = new HashMap<>();

    static {
        fruits.put(1, "kiwi");
        fruits.put(2, "pear");
        fruits.put(3, "kiwi");
        fruits.put(4, "banana");
        fruits.put(5, "melon");
        fruits.put(6, "banana");
        fruits.put(7, "melon");
        fruits.put(8, "pineapple");
        fruits.put(9, "apple");
        fruits.put(10, "pineapple");
        fruits.put(11, "cucumber");
        fruits.put(12, "pineapple");
        fruits.put(13, "cucumber");
        fruits.put(14, "orange");
        fruits.put(15, "grape");
        fruits.put(16, "orange");
        fruits.put(17, "grape");
        fruits.put(18, "apple");
        fruits.put(19, "grape");
        fruits.put(20, "cherry");
        fruits.put(21, "pear");
        fruits.put(22, "cherry");
        fruits.put(23, "pear");
        fruits.put(24, "kiwi");
        fruits.put(25, "banana");
        fruits.put(26, "kiwi");
        fruits.put(27, "apple");
        fruits.put(28, "melon");
        fruits.put(29, "banana");
        fruits.put(30, "melon");
        fruits.put(31, "pineapple");
        fruits.put(32, "melon");
        fruits.put(33, "pineapple");
        fruits.put(34, "cucumber");
        fruits.put(35, "orange");
        fruits.put(36, "apple");
        fruits.put(37, "orange");
        fruits.put(38, "grape");
        fruits.put(39, "orange");
        fruits.put(40, "grape");
        fruits.put(41, "cherry");
        fruits.put(42, "pear");
        fruits.put(43, "cherry");
        fruits.put(44, "pear");
        fruits.put(45, "apple");
        fruits.put(46, "pear");
        fruits.put(47, "kiwi");
        fruits.put(48, "banana");
        fruits.put(49, "kiwi");
        fruits.put(50, "banana");
        fruits.put(51, "melon");
        fruits.put(52, "pineapple");
        fruits.put(53, "melon");
        fruits.put(54, "apple");
        fruits.put(55, "cucumber");
        fruits.put(56, "pineapple");
        fruits.put(57, "cucumber");
        fruits.put(58, "orange");
        fruits.put(59, "cucumber");
        fruits.put(60, "orange");
        fruits.put(61, "grape");
        fruits.put(62, "cherry");
        fruits.put(63, "apple");
        fruits.put(64, "cherry");
        fruits.put(65, "pear");
        fruits.put(66, "cherry");
        fruits.put(67, "pear");
        fruits.put(68, "kiwi");
        fruits.put(69, "pear");
        fruits.put(70, "kiwi");
        fruits.put(71, "banana");
        fruits.put(72, "apple");
        fruits.put(73, "banana");
        fruits.put(74, "melon");
        fruits.put(75, "pineapple");
        fruits.put(76, "melon");
        fruits.put(77, "pineapple");
        fruits.put(78, "cucumber");
        fruits.put(79, "pineapple");
        fruits.put(80, "cucumber");
        fruits.put(81, "apple");
        fruits.put(82, "grape");
        fruits.put(83, "orange");
        fruits.put(84, "grape");
        fruits.put(85, "cherry");
        fruits.put(86, "grape");
        fruits.put(87, "cherry");
        fruits.put(88, "pear");
        fruits.put(89, "cherry");
        fruits.put(90, "apple");
        fruits.put(91, "kiwi");
        fruits.put(92, "banana");
        fruits.put(93, "kiwi");
        fruits.put(94, "banana");
        fruits.put(95, "melon");
        fruits.put(96, "banana");
        fruits.put(97, "melon");
        fruits.put(98, "pineapple");
        fruits.put(99, "apple");
        fruits.put(100, "pineapple");
    }

    public static String subtractSum(int n) {
        if (n >= 10) {
            int newSum = n - Arrays.stream(String.valueOf(n).split("")).mapToInt(Integer::valueOf).sum();
            return subtractSum(newSum);
        } else {
            return fruits.get(n);
        }
    }

    @Test
    public void basicTest() {
        assertEquals("apple", subtractSum(10));
    }
}
