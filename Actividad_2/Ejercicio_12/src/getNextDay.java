import java.util.Scanner;

public class getNextDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el dia");
        String day = scanner.nextLine();

        System.out.println("Mañana es " + getDay.presentDay(day));

        scanner.close();
    }  
}
