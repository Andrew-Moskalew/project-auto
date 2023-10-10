public class Auto {
    public Engine engine;
    public Body body;
    public String brand;
    public String model;
    static Engine engine19TDI = new Engine(110, 1.9, "Diesel");
    static Engine engine18i = new Engine(125, 1.8, "Petrol");
    static Engine engine16i = new Engine(100, 1.6, "Petrol");
    static Body body1 = new Body("Hatchback", "Black", "Steel");
    static Body body2 = new Body("Hatchback", "Red", "Steel");
    static Body body3 = new Body("Sedan", "White", "Steel");

    public Auto(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "brand=" + brand +
                ", model=" + model +
                ", engine='" + engine + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}
