package adp;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

public class LongestEvenLengthWord {
    public static String longestEvenLengthWord(String text) {
        return Arrays.stream(text.split(" ")).filter(word -> word.length() % 2 == 0).max(Comparator.comparingInt(String::length)).get();
    }

    @Test
    public void lengthTest(){
        String text = "Time to write great code";
        System.out.println(longestEvenLengthWord(text));
    }
}
