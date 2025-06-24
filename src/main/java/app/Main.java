package app;

public class Main {
    private static final double CONV_V = 2.20462;

    private static double convKgsToPounds(double kgs) {
        return kgs * CONV_V;
    }

    private static double convPoundsToKgs(double pounds) {
        return pounds / CONV_V;
    }

    public static void main(String[] args) {
        System.out.println("App for converting measures");
        System.out.println("Version 1.0");

        double kgs = 5;
        double pnds = 15;
        double pounds = convKgsToPounds(kgs);
        double kilos = convPoundsToKgs(pnds);
        System.out.println("Pounds: " + pounds + " pounds\nKilos: " + kilos + " kilos");
    }
}
