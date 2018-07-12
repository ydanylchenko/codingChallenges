import java.util.HashMap;

public class Welcome {
    private static final HashMap<String, String> welcomes = new HashMap<>();

    static {
        welcomes.put("english", "Welcome");
        welcomes.put("czech", "Vitejte");
        welcomes.put("danish", "Velkomst");
        welcomes.put("dutch", "Welkom");
        welcomes.put("estonian", "Tere tulemast");
        welcomes.put("finnish", "Tervetuloa");
        welcomes.put("flemish", "Welgekomen");
        welcomes.put("french", "Bienvenue");
        welcomes.put("german", "Willkommen");
        welcomes.put("irish", "Failte");
        welcomes.put("italian", "Benvenuto");
        welcomes.put("latvian", "Gaidits");
        welcomes.put("lithuanian", "Laukiamas");
        welcomes.put("polish", "Witamy");
        welcomes.put("spanish", "Bienvenido");
        welcomes.put("swedish", "Valkommen");
        welcomes.put("welsh", "Croeso");
    }

    public static String greet(String language) {
        return welcomes.getOrDefault(language, "Welcome");
    }
}