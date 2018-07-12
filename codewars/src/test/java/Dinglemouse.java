import org.junit.Test;

import java.util.stream.IntStream;

import static org.junit.Assert.assertArrayEquals;

public class Dinglemouse {

    public static int[] humanYearsCatYearsDogYears(final int humanYears) {
        int catYears = 0;
        int dogYears = 0;
        int[] years = IntStream.rangeClosed(1, humanYears).toArray();
        for (int year : years) {
            if (year == 1) {
                catYears += 15;
                dogYears += 15;
            } else if (year == 2) {
                catYears += 9;
                dogYears += 9;
            } else {
                catYears += 4;
                dogYears += 5;
            }
        }
        return new int[]{humanYears, catYears, dogYears};
    }


    @Test
    public void one() {
        assertArrayEquals(new int[]{1, 15, 15}, Dinglemouse.humanYearsCatYearsDogYears(1));
        assertArrayEquals(new int[]{2, 24, 24}, Dinglemouse.humanYearsCatYearsDogYears(2));
        assertArrayEquals(new int[]{10, 56, 64}, Dinglemouse.humanYearsCatYearsDogYears(10));
    }
}
