package com.triple;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertArrayEquals;


public class CountGifRequestsTest {
    public static String[] doIt(List<String> log) {
        return log.stream()
                .filter(line -> line.contains(".gif"))
                .filter(line -> line.contains("\"GET"))
                .filter(line -> line.contains(" 200 "))
                .map(line -> line.split(" ")[6])
                .map(line -> line.substring(line.lastIndexOf("/") + 1))
                .distinct()
                .toArray(String[]::new);
    }

    @Test
    public void testMe() {
        List<String> given = Arrays.asList(
                "unicomp6.unicomp.net - - [01/Jul/1995:00:00:06 -0400] \"GET /shuttle/countdown/ HTTP/1.0\" 200 3985",
                "burger.letters.com - - [01/Jul/1995:00:00:11 -0400] \"GET /shuttle/countdown/liftoff.html HTTP/1.0\" 304 0",
                "burger.letters.com - - [01/Jul/1995:00:00:12 -0400] \"GET /images/NASA-logosmall.gif HTTP/1.0\" 304 0",
                "burger.letters.com - - [01/Jul/1995:00:00:12 -0400] \"GET /shuttle/countdown/video/livevideo.gif HTTP/1.0\" 200 0",
                "d104.aa.net - - [01/Jul/1995:00:00:13 -0400] \"GET /shuttle/countdown/ HTTP/1.0\" 200 3985",
                "unicomp6.unicomp.net - - [01/Jul/1995:00:00:14 -0400] \"GET /shuttle/countdown/count.gif HTTP/1.0\" 200 40310",
                "unicomp6.unicomp.net - - [01/Jul/1995:00:00:14 -0400] \"GET /images/NASA-logosmall.gif HTTP/1.0\" 200 786",
                "unicomp6.unicomp.net - - [01/Jul/1995:00:00:14 -0400] \"GET /images/KSC-logosmall.gif HTTP/1.0\" 200 1204",
                "d104.aa.net - - [01/Jul/1995:00:00:15 -0400] \"GET /shuttle/countdown/count.gif HTTP/1.0\" 200 40310",
                "d104.aa.net - - [01/Jul/1995:00:00:15 -0400] \"GET /images/NASA-logosmall.gif HTTP/1.0\" 200 786"
        );
        List<String> expected = Arrays.asList(
                "livevideo.gif",
                "count.gif",
                "NASA-logosmall.gif",
                "KSC-logosmall.gif"
        );
        assertArrayEquals(expected.toArray(), doIt(given));
    }
}