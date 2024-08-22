import java.util.Scanner;

public class structureBuilding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el numero de estudiantes que tiene la universidad:");
        int numStudents = scanner.nextInt();

        System.out.println("Ingrese la capacidad del salon:");
        int roomCapacity = scanner.nextInt();

        System.out.println("Ingrese el numero de salones por piso");
        int roomPerFloor = scanner.nextInt();


        int totalFloors = numClassroom.calcRooms(numStudents, roomCapacity) / roomPerFloor;

        System.out.println("El edificio tendra " + numClassroom.calcRooms(numStudents, roomCapacity) + " salones y " + totalFloors + " pisos");

        scanner.close();
    }
}
