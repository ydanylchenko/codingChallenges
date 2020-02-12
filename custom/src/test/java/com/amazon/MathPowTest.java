package com.amazon;/*package whatever //do not write package name here */

import org.junit.Assert;

class MathPowTest {
    public static void main(String[] args) {
        int[] arr1 = new int[]{2, 2, 6,};
        int[] arr2 = new int[]{1, 5};
        int count = 0;
        for (int i = 0; i < Math.max(arr1.length, arr2.length); i++) {
            int first = i >= arr1.length ? 1 : arr1[i];
            int second = i >= arr2.length ? 1 : arr2[i];
            if (Math.pow(first, second) > Math.pow(second, first)) {
                count++;
            }
        }
        Assert.assertEquals(3, count);
    }
}