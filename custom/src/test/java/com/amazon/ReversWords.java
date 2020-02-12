package com.amazon;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ReversWords {
    public static void main(String[] args) {
        String input = "i.like.this.program.very.much";
        List<String> arr = Arrays.asList(input.split("\\."));
        System.out.println((arr));
        Collections.reverse(arr);
        System.out.println(String.join(".", arr));
    }
}