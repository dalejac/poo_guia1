import java.util.Scanner;

public class getResult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la operacion a realizar, escribiendo el operador:");
        String operator = scanner.nextLine();

        System.out.println("Ingrese el primer numero:");
        int x = scanner.nextInt();

        System.out.println("Ingrese el segundo numero:");
        int y = scanner.nextInt();

        System.out.println("El resultado de la operacion es " + calcResult.result(x, y, operator));

        scanner.close();
    }
}
