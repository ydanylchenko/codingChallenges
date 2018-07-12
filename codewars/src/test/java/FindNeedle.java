import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.function.Function;

import static java.util.stream.Collectors.toMap;
import static org.junit.Assert.assertEquals;

public class FindNeedle {
    public static String findNeedle(Object[] haystack) {
        LinkedList<Object> linkedList = new LinkedList<>();
        linkedList.addAll(Arrays.asList(haystack));
        return "found the needle at position " + linkedList.indexOf("needle");
    }

    @Test
    public void tests() {
        Object[] haystack1 = {"3", "123124234", null, "needle", "world", "hay", 2, "3", true, false};
        Object[] haystack2 = {"283497238987234", "a dog", "a cat", "some random junk", "a piece of hay", "needle", "something somebody lost a while ago"};
        Object[] haystack3 = {1, 2, 3, 4, 5, 6, 7, 8, 8, 7, 5, 4, 3, 4, 5, 6, 67, 5, 5, 3, 3, 4, 2, 34, 234, 23, 4, 234, 324, 324, "needle", 1, 2, 3, 4, 5, 5, 6, 5, 4, 32, 3, 45, 54};
        assertEquals("found the needle at position 3", findNeedle(haystack1));
        assertEquals("found the needle at position 5", findNeedle(haystack2));
        assertEquals("found the needle at position 30", findNeedle(haystack3));
    }
}