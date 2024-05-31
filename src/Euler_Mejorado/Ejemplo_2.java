
package Euler_Mejorado;


public class Ejemplo_2 {
  
    public static void main(String[] args) {
        double t0 = 0;
        double y0 = 1;
        double h = 0.1;
        int steps = 10;

        double t = t0;
        double y = y0;

        for (int i = 0; i < steps; i++) {
            double k1 = f(t, y);
            double k2 = f(t + h / 2, y + h / 2 * k1);
            y = y + h * k2;
            t = t + h;
            System.out.printf("t = %.2f, y = %.5f%n", t, y);
        }
    }

    public static double f(double t, double y) {
        return y - t+t + 1; 
    }
}


