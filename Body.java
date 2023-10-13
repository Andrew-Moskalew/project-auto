public class Body {
    public String type;
    public int numberofdoors;

    public Body(String type, int numberofdoors) {
        this.type = type;
        this.numberofdoors = numberofdoors;
    }

    @Override
    public String toString() {
        return "Body{" +
                "type='" + type + '\'' +
                ", numberofdoors=" + numberofdoors +
                '}';
    }
}
