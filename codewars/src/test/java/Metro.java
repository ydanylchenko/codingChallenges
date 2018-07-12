import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class Metro {

    public static int countPassengers_1(ArrayList<int[]> stops) {
        int currentAmount = 0;
        for (int[] stop : stops) {
            currentAmount = currentAmount + stop[0] - stop[1];
        }
        return currentAmount;
    }

    public static int countPassengers(ArrayList<int[]> stops) {
        return stops.stream().mapToInt(stop -> stop[0] - stop[1]).sum();
    }


    @Test
    public void test1() {
        ArrayList<int[]> list = new ArrayList<int[]>();
        list.add(new int[]{10, 0});
        list.add(new int[]{3, 5});
        list.add(new int[]{2, 5});
        assertEquals(5, Metro.countPassengers(list));
    }
}
