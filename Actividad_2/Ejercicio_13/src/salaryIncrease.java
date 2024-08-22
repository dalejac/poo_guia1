// La empresa La Generosa S.A desea aumentar el sueldo a sus empleados, para ello ha establecido las siguientes condiciones: quienes ganan hasta $ 800.000 tendrán un incremento del 10%, quienes devengan más de $ 800.000 y hasta 1’200.000 recibirán un aumento del 8% y los demás del 5%. Se requiere una función que reciba el sueldo actual de un empleado y que retorne el valor del aumento, y luego escriba un programa que usando la función anterior, calcule el valor del aumento y luego imprima el nuevo salario para ese empleado

public class salaryIncrease {
    public static double calcPercentage (int salary) {
        double salaryIncrease;

        if(salary <= 800000) {
            salaryIncrease = salary * 0.10;
        } else if(salary > 800000 && salary <= 1200000) {
            salaryIncrease = salary * 0.08; 
        } else {salaryIncrease = salary * 0.05;}
        return salaryIncrease;
    }
}
