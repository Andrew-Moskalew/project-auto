public class Main {
    public static void main(String[] args) {

        Auto auto1 = new Auto("Volkswagen","Golf","Base 1.6i 3 door hatchback");
        auto1.body = Auto.hatchback3dr;
        auto1.engine = Auto.engine16i;
        auto1.trimLevel = Auto.base;
        System.out.println(auto1);

        Auto auto2 = new Auto("Volkswagen","Golf","Trendline 1.9 TDI 5 door hatchback");
        auto2.body = Auto.hatchback5dr;
        auto2.engine = Auto.engine19TDI;
        auto2.trimLevel = Auto.trendline;
        System.out.println(auto2);

        Auto auto3 = new Auto("Volkswagen","Golf","Comfortline 1.8i variant");
        auto3.body = Auto.estate;
        auto3.engine = Auto.engine18i;
        auto3.trimLevel = Auto.comfortline;
        System.out.println(auto3);

        Auto auto4 = new Auto("Volkswagen","Bora","Highline 1.8T");
        auto4.body = Auto.sedan;
        auto4.engine = Auto.engine18t;
        auto4.trimLevel = Auto.highline;
        System.out.println(auto4);
    }
}
