import java.util.Scanner;

public class numBuses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el numero de estudiantes gordos:");
        int fatStudents = scanner.nextInt();

        System.out.println("Ingrese el numero de estudiantes flacos:");
        int thinStudents = scanner.nextInt();

        System.out.println("Ingrese el numero de asientos que tiene el bus:");
        int busSeats = scanner.nextInt();

        int result = totalSeats.calcNumBuses(fatStudents, thinStudents , busSeats) ;
        System.out.println("Se necesitan " + result + " bus(es) para el paseo");

        scanner.close();
    }
    
}
