/* Vamos a resolver el siguiente problema: Pedro acabó de recibir el sueldo mensual y se gasta el 40% de ese sueldo en el arriendo y el 15% del sueldo en comida, determine cuánto dinero se gastó en cada uno de esos dos ítems (en arriendo y en comida) y cuánto dinero le queda al final. Para ello:
a. Escriba una función que reciba el sueldo de Pedro y obtenga y retorna el gasto en arriendo
b. Escriba una función que reciba el sueldo de Pedro y obtenga y retorna el gasto en comida
c. Escriba un programa que lea el sueldo de Pedro, y, usando las funciones anteriores muestre el gasto en arriendo, el gasto en comida y cuánto dinero le quedó al final a Pedro después del arriendo y la comida. */

public class Expenses {
    public static double calcRent (double salary) {
        double totalRent = salary * 0.4;
        return totalRent;
    }

    public static double calcMeals (double salary) {
        double totalMeals = salary * 0.15;
        return totalMeals;
    }
    
}
