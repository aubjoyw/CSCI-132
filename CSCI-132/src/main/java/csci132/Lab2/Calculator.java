package csci132.Lab2;

public class Calculator {

    public Calculator() {
    }

    public static double add_numbers(double x, double y) {
        return x + y;
    }

    public static double subtract_numbers(double x, double y) {
        return x - y;
    }

    public static double multiply_numbers(double x, double y) {
        return x * y;
    }

    public static double modulo_numbers(double x, double y) {
        return x % y;
    }

    public static double power_numbers(double x, double y) {
        double n = 1;
        if (y < 0){
            double l = 1;
            for (double i = 0; i > y; i--) {
                l *= x;
            n = 1/l;
            }
        } else {
            for (double i = 0; i < y; i++) {
                n *= x;
            }
        }
        return n;
        /*
        return java.lang.Math.pow(x, y);
         */
    }


    public static double square_root(double x) {
        return java.lang.Math.sqrt(x);
    }
}
