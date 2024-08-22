// Escriba una función o método estático y luego un programa que use esa función, que encuentre el valor de la siguiente función algebraica: f(x, y) = x^2 + 2xy + y^2

public class algebraicFunction {
    public static double calcValue(int x, int y) {
        double value = Math.pow(x, 2) + (2 * x * y) + Math.pow(y, 2);
        return value;
    }
}