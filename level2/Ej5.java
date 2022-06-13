import java.util.ArrayList;
import java.util.Scanner;
public class Ej5 {
    private static Scanner ingreso = new Scanner(System.in);
    private static String[] semana = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes"};
    private static ArrayList<Integer> horasTrabajo = new ArrayList<Integer>();
    private static ArrayList<Integer> precioXHora = new ArrayList<Integer>();;
    private static ArrayList<Integer> totalXDia = new ArrayList<Integer>();;
    private static Integer totalSemana = 0;

    private static void imprimir(String mensaje){
        System.out.println(mensaje);
    }

    public static void main(String[] args) {
        for (String dia : semana) {
            imprimir("Cuantas horas trabajo el dia " + dia + ": ");
            horasTrabajo.add(ingreso.nextInt());
            imprimir("Y cuando es el valor por hora en el dia " + dia + ": ");
            precioXHora.add(ingreso.nextInt());
        }
        for (int i = 0; i < semana.length; i++) {
            totalXDia.add(horasTrabajo.get(i) * precioXHora.get(i));
            totalSemana += totalXDia.get(i);
        }
        imprimir("La lista de la semana pagada por dia es: " + totalXDia);
        imprimir("El total a cobrar en la semana es de " + totalSemana);
    }


}
