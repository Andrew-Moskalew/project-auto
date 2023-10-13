public class Engine {
    public int power;
    public double volume;
    public String fuelType;
    public boolean turbo;

    public Engine(int power, double volume, String fuelType, boolean turbo) {
        this.power = power;
        this.volume = volume;
        this.fuelType = fuelType;
        this.turbo = turbo;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "power=" + power +
                ", volume=" + volume +
                ", fuelType='" + fuelType + '\'' +
                ", turbo=" + turbo +
                '}';
    }
}
