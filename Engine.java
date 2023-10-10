public class Engine {
    public int power;
    public double volume;
    public String fuel;

    public Engine(int power, double volume, String fuel) {
        this.power = power;
        this.volume = volume;
        this.fuel = fuel;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "power=" + power +
                ", volume=" + volume +
                ", fuel='" + fuel + '\'' +
                '}';
    }
}
