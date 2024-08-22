import java.util.Scanner;

public class getName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre del hermano 1:");
        String nameA = scanner.nextLine();
        System.out.println("Y la edad:");
        int ageA = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Ingrese el nombre del hermano 2:");
        String nameB = scanner.nextLine();
        System.out.println("Y la edad:");
        int ageB = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Ingrese el nombre del hermano 3:");
        String nameC = scanner.nextLine();
        System.out.println("Y su edad:");
        int ageC = scanner.nextInt();
        scanner.nextLine();

        System.out.println("El nombre del hermano mayor es " + findEldest.oldBrother(ageA, nameA, ageB, nameB, ageC, nameC));

        scanner.close();
    }
}
