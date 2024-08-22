import java.util.Scanner;

public class totalSalary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el salario:");
        int salary = scanner.nextInt();

        double totalSalary = salary + salaryIncrease.calcPercentage(salary);

        System.out.println("El nuevo salario para el empleado " + totalSalary);

        scanner.close();
    }
}
