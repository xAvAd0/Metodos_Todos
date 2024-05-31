

public class Truncamiento_03 {
    public static void main(String[] args) {
        double number = 123.45678;
        int decimalPlaces = 3;
        double truncatedNumber = truncate(number, decimalPlaces);
        System.out.println("Número original: " + number);
        System.out.println("Número truncado a " + decimalPlaces + " decimales: " + truncatedNumber);
    }

    public static double truncate(double value, int decimalPlaces) {
        double scale = Math.pow(10, decimalPlaces);
        return Math.floor(value * scale) / scale;
    }
}
