import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class Sorter {
    public static List<String> sort(List<String> textbooks) {
        textbooks.sort(String.CASE_INSENSITIVE_ORDER);
        return textbooks;
    }

    @Test
    public void basicTest() {
        ArrayList<String> sorted = new ArrayList<>();
        ArrayList<String> strs = new ArrayList<>();
        for (String s : new String[]{"Algebra", "History", "Geometry", "English"})
            strs.add(s);
        for (String s : new String[]{"Algebra", "English", "Geometry", "History"})
            sorted.add(s);
        assertEquals(sorted, sort(strs));
    }

    @Test
    public void capitalizationTest() {
        ArrayList<String> sorted = new ArrayList<>();
        ArrayList<String> strs = new ArrayList<>();
        for (String s : new String[]{"Algebra", "history", "Geometry", "english"})
            strs.add(s);
        for (String s : new String[]{"Algebra", "english", "Geometry", "history"})
            sorted.add(s);
        assertEquals(sorted, sort(strs));
    }

    @Test
    public void symbolsTest() {
        ArrayList<String> sorted = new ArrayList<>();
        ArrayList<String> strs = new ArrayList<>();
        for (String s : new String[]{"Alg#bra", "$istory", "Geom^try", "**English"})
            strs.add(s);
        for (String s : new String[]{"$istory", "**English", "Alg#bra", "Geom^try"})
            sorted.add(s);
        assertEquals(sorted, sort(strs));
    }
}