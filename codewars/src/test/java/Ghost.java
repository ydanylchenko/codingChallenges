public class Ghost {
    private String color;

    public Ghost() {
        double random = Math.random();
        color = random >= 0.50 ? random > 0.75 ? "white" : "yellow" : random > 0.25 ? "purple" : "red";
    }

    public String getColor() {
        return color;
    }
}