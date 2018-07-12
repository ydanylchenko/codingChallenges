import org.junit.Test;

import javax.management.Query;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.LinkedList;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.Assert.assertEquals;

public class Kata {
    public static double fuelPrice(int litres, double pricePerLiter) {
        double price = pricePerLiter - ((litres < 10) ? (litres / 2) * 0.05 : 0.25);
//        if (litres >= 2) {
//            price -= 0.5;
//        } else if (litres >= 4) {
//            price -= 0.10;
//        } else if (litres >= 6) {
//            price -= 0.15;
//        } else if (litres >= 8) {
//            price -= 0.20;
//        } else if (litres >= 10) {
//            price -= 0.25;
//        }
        return BigDecimal.valueOf(litres * price).setScale(2, BigDecimal.ROUND_HALF_UP).floatValue();

    }

    @Test
    public void exampleTests() {
        assertEquals(5.65d, Kata.fuelPrice(5, 1.23d), 0.001d);
        assertEquals(18.40d, Kata.fuelPrice(8, 2.5d), 0.001d);
        assertEquals(27.50d, Kata.fuelPrice(5, 5.6d), 0.001d);
    }

    public static String leo(final int oscar) {
        if (oscar == 88) {
            return "Leo finally won the oscar! Leo is happy";
        } else if (oscar == 86) {
            return "Not even for Wolf of wallstreet?!";
        } else if (oscar > 88) {
            return "Leo got one already!";
        } else {
            return "When will you give Leo an Oscar?";
        }
    }

    @Test
    public void oscar88() {
        assertEquals("Leo finally won the oscar! Leo is happy", Kata.leo(88));
        assertEquals("Not even for Wolf of wallstreet?!", Kata.leo(86));
        assertEquals("When will you give Leo an Oscar?", Kata.leo(87));
        assertEquals("When will you give Leo an Oscar?", Kata.leo(83));
        assertEquals("When will you give Leo an Oscar?", Kata.leo(85));
        assertEquals("Leo got one already!", Kata.leo(89));
        assertEquals("Leo got one already!", Kata.leo(90));
        assertEquals("Leo got one already!", Kata.leo(95));
    }


    public static String HighAndLow1(String numbers) {
        int[] arr = Arrays.stream(numbers.split(" ")).mapToInt(Integer::valueOf).sorted().toArray();
        return arr[arr.length - 1] + " " + arr[0];
    }

    public static String HighAndLow(String numbers) {
        IntSummaryStatistics stats = Arrays.stream(numbers.split("\\s")).
                mapToInt(Integer::parseInt).summaryStatistics();

        return String.format("%d %d", stats.getMax(), stats.getMin());
    }

    @Test
    public void Test1() {
        assertEquals("42 -9", Kata.HighAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
    }


    public static int toBinary(int n) {
        return Integer.valueOf(Integer.toString(n, 2));
    }

    @Test
    public void testToBinary() {
        assertEquals(1, Kata.toBinary(1));
        assertEquals(10, Kata.toBinary(2));
        assertEquals(11, Kata.toBinary(3));
        assertEquals(101, Kata.toBinary(5));
    }

    public static int[] invert(int[] array) {
        return IntStream.of(array).map(operand -> -operand).toArray();
    }

    @Test
    public void testSomething() {

        int[] input = new int[]{-1, -2, -3, -4, -5};
        int[] expected = new int[]{1, 2, 3, 4, 5};
        assertEquals(Arrays.toString(expected), Arrays.toString(Kata.invert(input)));

        input = new int[]{-1, 2, -3, 4, -5};
        expected = new int[]{1, -2, 3, -4, 5};
        assertEquals(Arrays.toString(expected), Arrays.toString(Kata.invert(input)));

        input = new int[]{};
        expected = new int[]{};
        assertEquals(Arrays.toString(expected), Arrays.toString(Kata.invert(input)));

        input = new int[]{0};
        expected = new int[]{0};
        assertEquals(Arrays.toString(expected), Arrays.toString(Kata.invert(input)));
    }

    public static int rentalCarCost(int d) {
        return d * 40 - (d >= 3 ? d >= 7 ? 50 : 20 : 0);
    }

    @Test
    public void under3Tests() {
        assertEquals(40, Kata.rentalCarCost(1));
        assertEquals(80, Kata.rentalCarCost(2));
        assertEquals(100, Kata.rentalCarCost(3));
        assertEquals(140, Kata.rentalCarCost(4));
        assertEquals(180, Kata.rentalCarCost(5));
        assertEquals(220, Kata.rentalCarCost(6));
        assertEquals(230, Kata.rentalCarCost(7));
        assertEquals(270, Kata.rentalCarCost(8));
        assertEquals(310, Kata.rentalCarCost(9));
        assertEquals(350, Kata.rentalCarCost(10));
    }

    public static int summation(int n) {
        return IntStream.rangeClosed(0, n).sum();
    }

    public static int sum(int[] numbers) {
        int sum = 0;
        if (numbers != null && numbers.length > 1) {
            int max = IntStream.of(numbers).max().orElse(0);
            int min = IntStream.of(numbers).min().orElse(0);
            sum = IntStream.of(numbers).sum() - max - min;
        }
        return sum;
    }

    @Test
    public void BasicTests() {
        assertEquals(16, Kata.sum(new int[]{6, 2, 1, 8, 10}));
        assertEquals(16, Kata.sum(null));
    }

    public static int[] squareOrSquareRoot(int[] array) {
        return IntStream.of(array).map(value -> Math.sqrt(value) - (int) Math.sqrt(value) > 0 ? (int) Math.pow(value, 2) : (int) Math.sqrt(value)).toArray();
    }

    @Test
    public void basicTests() {
        int[] input = new int[]{4, 3, 9, 7, 2, 1};
        int[] expected = new int[]{2, 9, 3, 49, 4, 1};
        assertEquals(Arrays.toString(expected), Arrays.toString(Kata.squareOrSquareRoot(input)));

        input = new int[]{100, 101, 5, 5, 1, 1};
        expected = new int[]{10, 10201, 25, 25, 1, 1};
        assertEquals(Arrays.toString(expected), Arrays.toString(Kata.squareOrSquareRoot(input)));

        input = new int[]{1, 2, 3, 4, 5, 6};
        expected = new int[]{1, 4, 9, 2, 25, 36};
        assertEquals(Arrays.toString(expected), Arrays.toString(Kata.squareOrSquareRoot(input)));
    }

    public static String switchItUp(int number) {
        String[] digits = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        return digits[number];
    }

    public static String position(char alphabet) {
        return String.format("Position of alphabet: %s", (new Character(alphabet).hashCode() - new Character('a').hashCode() + 1));
    }

    @Test
    public void basicTests1() {
        assertEquals("Position of alphabet: 1", Kata.position('a'));
        assertEquals("Position of alphabet: 26", Kata.position('z'));
        assertEquals("Position of alphabet: 5", Kata.position('e'));
    }

}