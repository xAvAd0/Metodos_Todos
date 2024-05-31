
package Euler;


public class Ejemplo_4 {
    
   
    public static void main(String[] args) {
        double t0 = 0;
        double y0 = 1;
        double h = 0.1;
        int steps = 10;

        double t = t0;
        double y = y0;

        for (int i = 0; i < steps; i++) {
            y = y + h * f(t, y);
            t = t + h;
            System.out.printf("t = %.2f, y = %.5f%n", t, y);
        }
    }

    public static double f(double t, double y) {
        return y - t/t + 123; 
    }
}


