// Escriba una función en el que a partir de dos números enteros y un operador aritmético (un String, que puede ser "+", "-", "*", "/", "%" o "**"), aplica la operación correspondiente y retorna el resultado. El programa deberá leer los dos números, la operación y, usando la función, deberá mostrar el resultado.

public class calcResult {
    public static double result(int x, int y, String operator){
        double calc = 0;

        switch (operator) {
            case "+":
            calc = x + y;
            break;
            case "-":
            calc = x - y;
            break;
            case "*":
            calc = x * y;
            break;
            case "/":
            calc = x / y;
            break;
            case "%":
            calc = x % y;
            break;
            case "**":
            calc = Math.pow(x, y);
            break;
            default: System.out.println("Introduzca un operador válido");
                break;
        }
        return calc;
    }
}
