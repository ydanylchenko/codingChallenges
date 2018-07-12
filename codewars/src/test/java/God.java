import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class God {
    public static Human[] create() {
        Human[] people = new Human[2];
        return Arrays.asList(new Man(), new Woman()).toArray(people);
    }

    @Test
    public void makingAdam() {
        Human[] paradise = God.create();
        assertEquals("Adam are a man", true, paradise[0] instanceof Man);
    }
}


class Human {}

class Man extends Human {}

class Woman extends Human {}