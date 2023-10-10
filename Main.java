public class Main {
    public static void main(String[] args) {

        Auto auto1 = new Auto("Volkswagen", "Golf19tdi");
        auto1.body = Auto.body1;
        auto1.engine = Auto.engine19TDI;
        System.out.println(auto1);

        Auto auto2 = new Auto("Volkswagen", "gold1.6i");
        auto2.body = Auto.body2;
        auto2.engine = Auto.engine16i;
        System.out.println(auto2);

        Auto auto3 = new Auto("Volkswagen", "Passat18i");
        auto3.body = Auto.body3;
        auto3.engine = Auto.engine18i;
        System.out.println(auto3);

        Auto auto4 = new Auto("Volkswagen", "Passat19tdi");
        auto4.body = Auto.body3;
        auto4.engine = Auto.engine19TDI;
        System.out.println(auto4);
    }
}
