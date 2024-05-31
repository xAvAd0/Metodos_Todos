package Newton;

public class Ejemplo_3 {

    public static double interpolate(double[] x, double[] y, double xTarget) {
        double yTarget = y[0];
        for (int i = 0; i < x.length - 1; i++) {
            if (x[i] <= xTarget && x[i + 1] > xTarget) {
                double h = x[i + 1] - x[i];
                double k = (xTarget - x[i]) / h;
                double y0 = y[i];
                double y1 = y[i + 1];
                yTarget = y0 + k * (y1 - y0);
                break;
            }
        }
        return yTarget;
    }

    public static void main(String[] args) {
        double[] x = {5, 8, 9, 11, 15};
        double[] y = {8, 16, 24, 32, 100};

        double xTarget = 5.2;

        double yTarget = interpolate(x, y, xTarget);

        System.out.println("El valor interpolado de y para x = " + xTarget + " es " + yTarget);
    }
}