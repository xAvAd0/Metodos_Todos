

public class Redondeo_03 {
    public static void main(String[] args) {
        double a = 1.0;
        double b = 3.0;
        double result = (a / b) * b;
        System.out.println("Resultado de (1.0 / 3.0) * 3.0 = " + result);
        System.out.println("¿Es (1.0 / 3.0) * 3.0 igual a 1.0? " + (result == 1.0));
    }
}
