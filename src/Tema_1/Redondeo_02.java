

public class Redondeo_02 {
    public static void main(String[] args) {
        double x = 0.1;
        double sum = 0.0;
        for (int i = 0; i < 1000; i++) {
            sum += x;
        }
        System.out.println("Resultado de sumar 0.1 mil veces: " + sum);
        System.out.println("¿Es 0.1 * 1000 igual a sumar 0.1 mil veces? " + (sum == 100.0));
    }
}
