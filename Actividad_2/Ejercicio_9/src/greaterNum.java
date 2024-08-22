// Escribir una función que reciba dos números enteros y retorne el mayor número de los dos. Escriba un programa, que lea dos números enteros, y usando la función anterior, imprima el mayor de los dos. No puede usar el método MAX de Java, use la instrucción condicional IF

public class greaterNum {
    public static int greaterThan(int x, int y){
        int number;
        if(x > y){
            number = x; 
        } else {number = y;}

        return number;
    }
}
