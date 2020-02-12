package com.amazon;

import org.junit.Assert;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class RotateMatrix {
    public static void main(String[] args) {
        int[] original = new int[]{1, 4, 7, 8, 12, 13};
        Integer first = null;
        Integer second = null;
        int diff = Integer.MAX_VALUE;
        for (int i = 0; i < original.length - 1; i++) {
            int actualDiff = Math.abs(original[i] - original[i + 1]);
            if (actualDiff < diff) {
                diff = actualDiff;
                first = original[i];
                second = original[i + 1];
            }
        }
        System.out.println(diff);
        System.out.println(first);
        System.out.println(second);
    }
}
