import java.util.Scanner;


public class Ej8 {
    static Scanner ingreso = new Scanner(System.in);

    public static void main(String[] args) {
        print("Nombre y apellido:");
        String nombreApellido = ingreso.nextLine();
        print("Edad:");
        String edad = ingreso.nextLine();
        print("Direccion:");
        String direccion = ingreso.nextLine();
        print("Ciudad:");
        String ciudad = ingreso.nextLine();
        print(ciudad + " - " + direccion + " - " + edad + " - " + nombreApellido);
    }

    private static void print(String mensaje){
        System.out.println(mensaje);
    }
}
