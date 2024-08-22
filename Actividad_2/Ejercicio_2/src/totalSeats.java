// El paseo: ya que finalizó la pandemia, vamos a organizar un paseo. Al paseo irán estudiantes gordos y flacos. Un estudiante gordo ocupa dos sillas de un bus y un estudiante flaco ocupa solo una silla. Si sabemos cuántas sillas tiene un bus, cuántos estudiantes gordos van al paseo y cuántos estudiantes flacos van al paseo, escriba una función y un programa en Java que encuentre el número de buses que se necesitan alquilar para llevar todos esos estudiantes al paseo

public class totalSeats {
    public static int calcNumBuses (int fatStudents, int thinStudents, int busSeats) {
        int fatStudentSeats = fatStudents * 2;
        int totalStudentSeats = fatStudentSeats + thinStudents;
        int numBuses = totalStudentSeats / busSeats;

        if(totalStudentSeats < busSeats) {
            numBuses = 1;
        }

        else if(totalStudentSeats % numBuses != 0) {
            numBuses ++;
        }

        return numBuses;
    }
}

