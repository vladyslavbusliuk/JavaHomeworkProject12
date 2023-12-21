package app;

public class TrafficLight {
    public enum LightColor {
        RED("стояти"), YELLOW("приготуватися"), GREEN("рухатися");

        private final String description;

        LightColor(String description) {
            this.description = description;
        }

        public String getDescription() {
            return description;
        }
    }
    public static void main(String[] args) {

        LightColor currentColor = LightColor.RED;

        System.out.println(currentColor + " (" + currentColor.getDescription() + ")");

        currentColor = LightColor.YELLOW;

        System.out.println(currentColor + " (" + currentColor.getDescription() + ")");

        currentColor = LightColor.GREEN;

        System.out.println(currentColor + " (" + currentColor.getDescription() + ")");
    }
}
