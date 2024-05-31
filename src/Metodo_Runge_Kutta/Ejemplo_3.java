
package Metodo_Runge_Kutta;

public class Ejemplo_3 {
    
    public static void main(String[] args) {
        double t0 = 0;
        double y0 = 1;
        double h = 0.1;
        int steps = 10;

        double t = t0;
        double y = y0;

        for (int i = 0; i < steps; i++) {
            double k1 = h * f(t, y);
            double k2 = h * f(t + h / 2, y + k1 / 2);
            double k3 = h * f(t + h / 2, y + k2 / 2);
            double k4 = h * f(t + h, y + k3);
            y = y + (k1 + 2 * k2 + 2 * k3 + k4) / 6;
            t = t + h;
            System.out.printf("t = %.2f, y = %.5f%n", t, y);
        }
    }

    public static double f(double t, double y) {
        return y - t+t + 3; 
    }
}


