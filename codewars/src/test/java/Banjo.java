import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Banjo {
    public static String areYouPlayingBanjo(String name) {
        return (name.toLowerCase().startsWith("r")) ? name + " plays banjo" : name + " does not play banjo";
    }

    @Test
    public void PeopleThatPlayBanjo() {
        assertEquals("Nope!", Banjo.areYouPlayingBanjo("Martin"), "Martin does not play banjo");
        assertEquals("Nope!", Banjo.areYouPlayingBanjo("Rikke"), "Rikke plays banjo");
    }
}