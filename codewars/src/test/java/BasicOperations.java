import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BasicOperations {
    public static Integer basicMath(String op, int v1, int v2) {
        switch (op){
            case "+":
                return v1 + v2;
            case "-":
                return v1 - v2;
            case "/":
                return v1 / v2;
            case "*":
                return v1 * v2;
            default:
                return null;
        }
    }

    @Test
    public void testBasics()  {
        System.out.println("Basic Tests");
        assertEquals(new Integer(11), basicMath("+", 4, 7));
        assertEquals(new Integer(-3), basicMath("-", 15, 18));
        assertEquals(new Integer(25), basicMath("*", 5, 5));
        assertEquals(new Integer(7), basicMath("/", 49, 7));
    }
}