package com.other;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;

public class MissingWords {
    public static String[] getMissingWords(String t, String s) {
        List<String> subWords = Arrays.asList(s.toLowerCase().split("\\W"));
        return Arrays.stream(t.split("\\W")).filter(word -> !subWords.contains(word.toLowerCase())).toArray(String[]::new);
    }

    @Test
    public void tests() {
        assertArrayEquals(new String[]{"I", "using", "programming"}, getMissingWords("I am using HackerRank to improve programming", "am HackerRank to improve"));
        assertArrayEquals(new String[]{"I", "like"}, getMissingWords("I like cheese", "cheese"));
        assertArrayEquals(new String[]{"I", "love"}, getMissingWords("I love programming", "programming"));
    }
}
