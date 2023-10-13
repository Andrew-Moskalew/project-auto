public class Body {
    public String type;
    public String color;
    public String material;

    public Body(String type, String color, String material) {
        this.type = type;
        this.color = color;
        this.material = material;
    }

    @Override
    public String toString() {
        return "Body{" +
                "type='" + type + '\'' +
                ", color='" + color + '\'' +
                ", material='" + material + '\'' +
                '}';
    }
}
