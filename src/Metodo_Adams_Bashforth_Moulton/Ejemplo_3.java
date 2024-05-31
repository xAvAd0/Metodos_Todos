
package Metodo_Adams_Bashforth_Moulton;
import java.util.Arrays;

public class Ejemplo_3 {

    public static void main(String[] args) {
        double t0 = 0;
        double y0 = 1;
        double h = 0.1;
        int steps = 10;

        double[] t = new double[steps + 1];
        double[] y = new double[steps + 1];
        t[0] = t0;
        y[0] = y0;

        
        for (int i = 0; i < 3; i++) {
            double k1 = h * f(t[i], y[i]);
            double k2 = h * f(t[i] + h / 2, y[i] + k1 / 2);
            double k3 = h * f(t[i] + h / 2, y[i] + k2 / 2);
            double k4 = h * f(t[i] + h, y[i] + k3);
            y[i + 1] = y[i] + (k1 + 2 * k2 + 2 * k3 + k4) / 6;
            t[i + 1] = t[i] + h;
        }

        for (int i = 3; i < steps; i++) {
            t[i + 1] = t[i] + h;

            
            double y_pred = y[i] + h / 24 * (55 * f(t[i], y[i]) - 59 * f(t[i - 1], y[i - 1]) + 37 * f(t[i - 2], y[i - 2]) - 9 * f(t[i - 3], y[i - 3]));

            
            y[i + 1] = y[i] + h / 24 * (9 * f(t[i + 1], y_pred) + 19 * f(t[i], y[i]) - 5 * f(t[i - 1], y[i - 1]) + f(t[i - 2], y[i - 2]));

            System.out.printf("t = %.2f, y = %.5f%n", t[i + 1], y[i + 1]);
        }
    }

    public static double f(double t, double y) {
        return y + t*t + 6; 
    }
}


