package adp;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

public class LongestEvenLengthWordSimple {
    public static String longestEvenLengthWord(String text) {
        String[] words = text.split(" ");
        String longest = words[0];
        for (String word : words) {
            if (word.length() % 2 == 0 && word.length() > longest.length()) {
                longest = word;
            }
        }
        return longest;
    }

    @Test
    public void lengthTest() {
        String text = "Time to write great code";
        System.out.println(longestEvenLengthWord(text));
    }
}
