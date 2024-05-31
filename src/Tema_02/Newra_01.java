


public class Newra_01 {
    public static void main(String[] args) {
        double x0 = 2.0; // valor inicial
        double tol = 1e-6;
        int maxIter = 1000;
        double root = newtonRaphson(x0, tol, maxIter);
        System.out.println("Raíz: " + root);
    }

    public static double f(double x) {
        return x * x - 4;
    }

    public static double df(double x) {
        return 2 * x;
    }

    public static double newtonRaphson(double x0, double tol, int maxIter) {
        double x = x0;
        for (int i = 0; i < maxIter; i++) {
            double fx = f(x);
            double dfx = df(x);
            if (Math.abs(fx) < tol) {
                break;
            }
            x = x - fx / dfx;
        }
        return x;
    }
}
