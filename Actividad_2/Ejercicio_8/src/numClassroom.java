/*En el nuevo edificio de la universidad, cada piso tendrá el mismo número de salones y todos estos salones tendrán la misma capacidad (cantidad de estudiantes que caben en el salón). Escriba las siguientes funciones:
a. La primera función que calcule el número de salones del nuevo edificio a partir del número de estudiantes que tiene la universidad y la capacidad de un salón.
b. La segunda función obtendrá el número de pisos que tendrá el nuevo edificio a partir del número de salones que vamos a necesitar y el número de salones que tendrá un piso del edificio.
c. Escriba finalmente el programa que lea desde el teclado el número de estudiantes que tiene la universidad, la capacidad de un salón y el número de salones que tendrá un piso, y qué usando las dos funciones anteriores, encuentre e imprima el número de salones y el número de pisos del nuevo edificio
 */

public class numClassroom {
    public static int calcRooms(int numStudents, int roomCapacity){
        int totalRooms = numStudents / roomCapacity;

        return totalRooms;
    }
}
