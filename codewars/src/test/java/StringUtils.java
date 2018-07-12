import org.junit.Test;

import java.util.Arrays;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;

public class StringUtils {

//    public static String toAlternativeString(String string) {
//        return string.chars().map(StringUtils::charMapper).mapToObj(value -> Character.getName(value)).collect(Collectors.joining());
//    }


    public static String toAlternativeString(String string) {
        return Arrays.stream(string.split("")).map(StringUtils::switchCase).collect(Collectors.joining());
    }

    private static String switchCase(String character) {
        if (character.matches("[A-Z]")) {
            return character.toLowerCase();
        } else if (character.matches("[a-z]")) {
            return character.toUpperCase();
        } else {
            return character;
        }
    }


    @Test
    public void fixedTests() {
        assertEquals("HELLO WORLD", StringUtils.toAlternativeString("hello world"));
        assertEquals("hello world", StringUtils.toAlternativeString("HELLO WORLD"));
        assertEquals("HELLO world", StringUtils.toAlternativeString("hello WORLD"));
        assertEquals("hEllO wOrld", StringUtils.toAlternativeString("HeLLo WoRLD"));
        assertEquals("Hello World", StringUtils.toAlternativeString(StringUtils.toAlternativeString("Hello World")));
        assertEquals("12345", StringUtils.toAlternativeString("12345"));
        assertEquals("1A2B3C4D5E", StringUtils.toAlternativeString("1a2b3c4d5e"));
        assertEquals("sTRINGuTILS.TOaLTERNATINGcASE", StringUtils.toAlternativeString("StringUtils.toAlternatingCase"));
        assertEquals("ALTerNAtiNG CaSe", StringUtils.toAlternativeString("altERnaTIng cAsE"));
        assertEquals("altERnaTIng cAsE", StringUtils.toAlternativeString("ALTerNAtiNG CaSe"));
        assertEquals("ALTerNAtiNG CaSe <=> altERnaTIng cAsE", StringUtils.toAlternativeString("altERnaTIng cAsE <=> ALTerNAtiNG CaSe"));
        assertEquals("altERnaTIng cAsE <=> ALTerNAtiNG CaSe", StringUtils.toAlternativeString("ALTerNAtiNG CaSe <=> altERnaTIng cAsE"));
    }
}