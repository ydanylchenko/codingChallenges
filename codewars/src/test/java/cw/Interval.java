package cw;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class Interval {

    public static int sumIntervals(int[][] intervals) {
        if (intervals == null || intervals.length == 0) {
            return 0;
        }
        System.out.println("Input");
        Arrays.stream(intervals).forEach(ints -> System.out.println(Arrays.toString(ints)));
        System.out.println("Normalized");
        int min = Arrays.stream(intervals).map(ints -> Arrays.stream(ints).min().orElse(0)).min(Integer::compareTo).orElse(0);
        int max = Arrays.stream(intervals).map(ints -> Arrays.stream(ints).max().orElse(0)).max(Integer::compareTo).orElse(0);
        int[][] normalizedIntervals = new int[intervals.length][max + Math.abs(min)];
        for (int row = 0; row < normalizedIntervals.length; row++) {
            for (int cell = intervals[row][0]; cell < intervals[row][1]; cell++) {
                normalizedIntervals[row][cell + Math.abs(min)] = 1;
            }
        }
        Arrays.stream(normalizedIntervals).forEach(ints -> System.out.println(Arrays.toString(ints)));
        int[] lengths = new int[normalizedIntervals[0].length];

        for (int cell = 0; cell < normalizedIntervals[0].length; cell++) {
            for (int[] normalizedInterval : normalizedIntervals) {
                if (normalizedInterval[cell] == 1) {
                    lengths[cell] = 1;
                }
            }
        }
        System.out.println("Merged");
        System.out.println(Arrays.toString(lengths));
        return Arrays.stream(lengths).sum();
    }

    @Test
    public void shouldHandleNullOrEmptyIntervals() {
        assertEquals(0, sumIntervals(null));
        assertEquals(0, sumIntervals(new int[][]{}));
        assertEquals(0, sumIntervals(new int[][]{{4, 4}, {6, 6}, {8, 8}}));
    }

    @Test
    public void shouldAddDisjoinedIntervals() {
        assertEquals(9, sumIntervals(new int[][]{{1, 2}, {6, 10}, {11, 15}}));
        assertEquals(11, sumIntervals(new int[][]{{4, 8}, {9, 10}, {15, 21}}));
        assertEquals(7, sumIntervals(new int[][]{{-1, 4}, {-5, -3}}));
        assertEquals(78, sumIntervals(new int[][]{{-245, -218}, {-194, -179}, {-155, -119}}));
    }

    @Test
    public void shouldAddAdjacentIntervals() {
        assertEquals(54, sumIntervals(new int[][]{{1, 2}, {2, 6}, {6, 55}}));
        assertEquals(23, sumIntervals(new int[][]{{-2, -1}, {-1, 0}, {0, 21}}));
    }

    @Test
    public void shouldAddOverlappingIntervals() {
        assertEquals(7, sumIntervals(new int[][]{{1, 4}, {7, 10}, {3, 5}}));
        assertEquals(6, sumIntervals(new int[][]{{5, 8}, {3, 6}, {1, 2}}));
        assertEquals(19, sumIntervals(new int[][]{{1, 5}, {10, 20}, {1, 6}, {16, 19}, {5, 11}}));
    }

    @Test
    public void shouldHandleMixedIntervals() {
        assertEquals(13, sumIntervals(new int[][]{{2, 5}, {-1, 2}, {-40, -35}, {6, 8}}));
        assertEquals(1234, sumIntervals(new int[][]{{-7, 8}, {-2, 10}, {5, 15}, {2000, 3150}, {-5400, -5338}}));
        assertEquals(158, sumIntervals(new int[][]{{-101, 24}, {-35, 27}, {27, 53}, {-105, 20}, {-36, 26},}));
    }
}
