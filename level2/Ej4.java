import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Ej4 {
    
    public static void main(String[] args) {
        Scanner ingreso = new Scanner(System.in);
        ArrayList<String> alumnos = new ArrayList<String>();
        for (int i = 0; i < 12; i++) {
            imprimir("Favor de cargar el nombre de un alumno: ");
            String alumno = ingreso.nextLine();
            alumnos.add(alumno);
        }
        List<String> curso1 = alumnos.subList(0, 4);
        List<String> curso2 = alumnos.subList(4, 8);
        List<String> curso3 = alumnos.subList(8, 12);
        imprimir("Alumnos del primer curso: " + curso1);
        imprimir("Alumnos del segundo curso: " + curso2);
        imprimir("Alumnos del tercero curso: " + curso3);
        ingreso.close();
    }

    private static void imprimir(String mensaje){
        System.out.println(mensaje);
    }
}
