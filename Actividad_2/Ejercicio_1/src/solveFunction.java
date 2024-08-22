import java.util.Scanner;

public class solveFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el valor de x:");
        int x = scanner.nextInt();

        System.out.println("Ingrese el valor de y:");
        int y = scanner.nextInt();
        
        double result = algebraicFunction.calcValue(x, y);
        System.out.println("El valor de la funcion es:" + result);

        scanner.close();
    }
}