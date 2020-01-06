

import java.util.stream.IntStream;

import static org.junit.Assert.assertEquals;

public class RowSumOddNumbers {
    public static int rowSumOddNumbers(int row) {
        int start = 0;
        for (int i = 0; i <= row; i++) {
            start += i;
        }
        int end = start;
        int sum = start;
        while (--row > 0) {
            end += 2;
            sum += end;
        }
//        for (int i = 0; i <= row; i++) {
//            end += i;
//            sum += 2;
//        }
        System.out.println(start + "\t" + end + "\t" + sum);
        return sum;
//        return IntStream.range(start, end).filter(value -> value % 2 == 1).sum();
    }

    public static void main(String[] args) {
        assertEquals(1, RowSumOddNumbers.rowSumOddNumbers(1));
        assertEquals(8, RowSumOddNumbers.rowSumOddNumbers(2));
        assertEquals(27, RowSumOddNumbers.rowSumOddNumbers(3));
        assertEquals(74088, RowSumOddNumbers.rowSumOddNumbers(42));
    }
}