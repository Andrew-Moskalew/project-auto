public class TrimLevel {
public String seatsMaterial;
boolean airConditioner;
boolean sunroof;
boolean alloyWheels;
boolean leatherSteeringWheel;

    public TrimLevel(String seatsMaterial, boolean airConditioner, boolean sunroof, boolean alloyWheels, boolean leatherSteeringWheel) {
        this.seatsMaterial = seatsMaterial;
        this.airConditioner = airConditioner;
        this.sunroof = sunroof;
        this.alloyWheels = alloyWheels;
        this.leatherSteeringWheel = leatherSteeringWheel;
    }

    @Override
    public String toString() {
        return "TrimLevel{" +
                "seatsMaterial='" + seatsMaterial + '\'' +
                ", airConditioner=" + airConditioner +
                ", sunroof=" + sunroof +
                ", alloyWheels=" + alloyWheels +
                ", leatherSteeringWheel=" + leatherSteeringWheel +
                '}';
    }
}
