package app;

public class Main {
    private static final double CONV_V = 2.20462;

    private static double convKgsToPounds(double kgs) {
        return kgs * CONV_V;
    }

    public static void main(String[] args) {
        System.out.println("Converter app");

        double kgs = 5;
        double pounds = convKgsToPounds(kgs);
        System.out.println("Pounds: " + pounds);
    }
}
