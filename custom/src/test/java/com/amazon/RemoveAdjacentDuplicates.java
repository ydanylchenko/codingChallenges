package com.amazon;

import org.junit.Assert;

public class RemoveAdjacentDuplicates {
    public static void main(String[] args) {
        String text = "ggeeksforgeekk";

        StringBuilder reversed = new StringBuilder();
        char prev = '\0';
        char next = '\0';
        for (int i = 0; i < text.length(); i++) {
            char current = text.charAt(i);
            if (current != prev) {
                reversed.append(current);
                prev = current;
            }
        }
        Assert.assertEquals("gksforgk", reversed.toString());
    }
}
