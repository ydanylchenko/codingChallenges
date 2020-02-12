package com.amazon;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Aaaa {
    public static void main(String[] args) {
        int[]arr = new int[]{0, 2, 1, 2, 0};
        arr=Arrays.stream(arr).sorted().toArray();
        System.out.println(Arrays.toString(arr));
        List<Integer> coll = Arrays.stream(arr).boxed().sorted().collect(Collectors.toList());
        System.out.println(coll);
        Collections.reverse(coll);
        System.out.println(coll);
    }
}
