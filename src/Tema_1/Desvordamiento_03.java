
public class Desvordamiento_03 {
    public static void main(String[] args) {
        for (int i = 1; i < 15; i++) {
            try {
                long result = factorial(i);
                System.out.println("Factorial de " + i + " = " + result);
            } catch (ArithmeticException e) {
                System.out.println("Factorial de " + i + " causa desbordamiento: " + e.getMessage());
            }
        }
    }

    public static long factorial(int n) {
        if (n < 0) throw new IllegalArgumentException("El número debe ser positivo.");
        if (n == 0) return 1;
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result = Math.multiplyExact(result, i); 
        }
        return result;
    }
}

