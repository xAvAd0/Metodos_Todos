


import java.lang.Math;

public class Secante_03 {
    public static void main(String[] args) {
        double x0 = 0.0; // primer valor inicial
        double x1 = 1.0; // segundo valor inicial
        double tol = 1e-6;
        int maxIter = 1000;
        double root = secant(x0, x1, tol, maxIter);
        System.out.println("Raíz: " + root);
    }

    public static double f(double x) {
        return Math.cos(x) - x;
    }

    public static double secant(double x0, double x1, double tol, int maxIter) {
        double x2 = x0;
        for (int i = 0; i < maxIter; i++) {
            x2 = x1 - f(x1) * (x1 - x0) / (f(x1) - f(x0));
            if (Math.abs(f(x2)) < tol) {
                break;
            }
            x0 = x1;
            x1 = x2;
        }
        return x2;
    }
}
