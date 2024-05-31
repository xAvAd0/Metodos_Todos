

import java.lang.Math;

public class Viseccion_05 {
    public static void main(String[] args) {
        double a = 1.0; // intervalo inicial
        double b = 3.0; // intervalo inicial
        double tol = 1e-6;
        int maxIter = 1000;
        double root = bisection(a, b, tol, maxIter);
        System.out.println("Raíz: " + root);
    }

    public static double f(double x) {
        return Math.log(x) - 1;
    }

    public static double bisection(double a, double b, double tol, int maxIter) {
        double c = a;
        for (int i = 0; i < maxIter; i++) {
            c = (a + b) / 2;
            if (f(c) == 0.0 || (b - a) / 2 < tol) {
                break;
            }
            if (Math.signum(f(c)) == Math.signum(f(a))) {
                a = c;
            } else {
                b = c;
            }
        }
        return c;
    }
}
