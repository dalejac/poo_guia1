import java.util.Scanner;

public class getNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer numero:");
        int x = scanner.nextInt();

        System.out.println("Ingrese el segundo numero:");
        int y = scanner.nextInt();


        System.out.println("El numero mayor es " + greaterNum.greaterThan(x, y));

        scanner.close();
    }
}
