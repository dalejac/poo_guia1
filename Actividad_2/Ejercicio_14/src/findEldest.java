//  Escriba una función, y el correspondiente programa en Java en el que a partir de los nombres y las edades de tres hermanos, obtenga el nombre del hermano mayor.

public class findEldest {
    public static String oldBrother(int ageA, String nameA, int ageB, String nameB, int ageC, String nameC) {
        String nameOldest;

        if(ageA > ageB && ageA > ageC){
            nameOldest = nameA;
        }
        else if (ageB > ageA && ageB > ageC){
            nameOldest = nameB;
        }
        else {nameOldest = nameC;}

        return nameOldest;
    }
}
