// Escribir una función que reciba el nombre de un día (por ejemplo "lunes" o "martes", etc.) y retorne el nombre del día de mañana. Usando la función anterior, escriba un programa que lea el nombre de un día y que imprima el nombre del día de mañana

public class getDay {
    public static String presentDay (String day){
        String nextDay = "";

        switch (day) {
            case "lunes":
            nextDay = "martes";
            break;
            case "martes":
            nextDay = "miercoles";
            break;
            case "miercoles":
            nextDay = "jueves";
            break;
            case "jueves":
            nextDay = "viernes";
            break;
            case "viernes":
            nextDay = "sabado";
            break;
            case "sabado":
            nextDay = "domingo";
            break;
    
            default: nextDay = "lunes";
                break;
        }

        return nextDay;
    }
}
