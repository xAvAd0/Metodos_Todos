package Cuadratica;

public class Ejemplo_4 {

    public static void main(String[] args) {
        System.out.println("Solucion de ecuaciones cuadráticas");
        double a = 41, b = 63, c = 39;
        double x1, x2, producto, cuadrado, diferencia, raiz;

        cuadrado = Math.pow(b, 2);
        producto = 4 * a * c;
        diferencia = cuadrado - producto;
        raiz = Math.sqrt(diferencia);

        x1 = (-b + raiz) / (2 * a);
        x2 = (-b - raiz) / (2 * a);

        System.out.println("La ecuacion es: " + a + "x^2 + " + b + "x + " + c + " = 0");
        System.out.println("Las raices son:");
        System.out.println("El valor de x1 es: " + x1);
        System.out.println("El valor de x2 es: " + x2);
    }
}
