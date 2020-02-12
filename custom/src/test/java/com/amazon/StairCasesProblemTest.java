package com.amazon;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StairCasesProblemTest {

    @Test
    public void testOne() {
        Assert.assertEquals(1, numWays(1));
    }

    @Test
    public void testTwo() {
        Assert.assertEquals(2, numWays(2));
    }

    @Test
    public void testThree() {
        Assert.assertEquals(3, numWays(3));
    }

    @Test
    public void testFour() {
        Assert.assertEquals(5, numWays(4));
    }

    private static int factorial(int n) {
        return (n == 1 || n == 0) ? 1 : n * factorial(n - 1);
    }


    private static int numWays(int stairsAmount, int[] stepsArr) {
        Set<Integer> steps = Arrays.stream(stepsArr).boxed().collect(Collectors.toSet());
        steps.add(0);
        System.out.println("Steps: " + steps);
        System.out.println("All variations:");
        ArrayList<int[]> variations = generateVariations(steps.toArray(Integer[]::new), stairsAmount);
        variations.forEach(ints -> System.out.println(Arrays.toString(ints)));
        System.out.println("Filtered by sum:");
        ArrayList<int[]> matching = variations.stream().filter(ints -> Arrays.stream(ints).sum() == stairsAmount).collect(Collectors.toCollection(ArrayList::new));
        matching.forEach(ints -> System.out.println(Arrays.toString(ints)));
        System.out.println("Converted to String");
        ArrayList<String> strings = matching.stream().map(ints -> Arrays.stream(ints).mapToObj(String::valueOf).collect(Collectors.joining())).collect(Collectors.toCollection(ArrayList::new));
        strings.forEach(System.out::println);
        System.out.println("Unique No Zeros");
        ArrayList<String> uniqueNoZeros = strings.stream().map(s -> s.replaceAll("0", "")).distinct().collect(Collectors.toCollection(ArrayList::new));
        uniqueNoZeros.forEach(System.out::println);
        return uniqueNoZeros.size();
    }

    private static int numWays(int stairsAmount) {
        return numWays(stairsAmount, new int[]{1, 2});
    }

    static ArrayList<int[]> generateVariations(Integer[] digitsToBeCombined, int combinationsLength) {
        ArrayList<int[]> rows = new ArrayList<>();
        generateVariations(digitsToBeCombined, "", digitsToBeCombined.length, combinationsLength, rows);
        return rows;
    }

    static void generateVariations(Integer[] digitsToBeCombined,
                                   String prefix,
                                   int digitsAmount,
                                   int combinationLength,
                                   ArrayList<int[]> rows) {
        if (combinationLength == 0) {
            rows.add(Arrays.stream(prefix.split("")).mapToInt(Integer::valueOf).toArray());
        } else {
            for (int i = 0; i < digitsAmount; i++) {
                String newPrefix = prefix + digitsToBeCombined[i];
                generateVariations(digitsToBeCombined, newPrefix, digitsAmount, combinationLength - 1, rows);
            }
        }
    }
}