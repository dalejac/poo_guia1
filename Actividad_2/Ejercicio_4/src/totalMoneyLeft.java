import java.util.Scanner;

public class totalMoneyLeft {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el sueldo que recibio Pedro:");
        int salary = scanner.nextInt();

        double totalSpend = Expenses.calcRent(salary) + Expenses.calcMeals(salary);
        double totalLeft = salary - totalSpend;
        System.out.println("Pedro gasta " + Expenses.calcRent(salary) + " en arriendo. Gasta " + Expenses.calcMeals(salary) + " en comida. Quedando con " + totalLeft + " en total");
        
        scanner.close();
    }
}