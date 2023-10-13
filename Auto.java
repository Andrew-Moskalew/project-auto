public class Auto {
    public Engine engine;
    public Body body;
    public TrimLevel trimLevel;
    public String brand;
    public String model;
    public String modification;
    static Engine engine19TDI = new Engine(110, 1.9, "Diesel", true);
    static Engine engine18i = new Engine(125, 1.8, "Petrol", false);
    static Engine engine16i = new Engine(100, 1.6, "Petrol", false);
    static Engine engine18t = new Engine(150, 1.8, "Petrol", true);
    static Body hatchback3dr = new Body("Hatchback", 3);
    static Body hatchback5dr = new Body("Hatchback", 5);
    static Body sedan = new Body("Sedan", 4);
    static Body estate = new Body("Estate", 5);
    static TrimLevel base = new TrimLevel("silk", false, false, false, false);
    static TrimLevel trendline = new TrimLevel("silk", false, true, false, false);
    static TrimLevel comfortline = new TrimLevel("velour", true, false, true, false);
    static TrimLevel highline = new TrimLevel("leather", true, true, true, true);

    public Auto(String brand, String model, String modification) {
        this.brand = brand;
        this.model = model;
        this.modification = modification;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", modification='" + modification + '\'' +
                ", engine=" + engine +
                ", body=" + body +
                ", trimLevel=" + trimLevel +
                '}';
    }
}
