import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner ingreso = new Scanner(System.in);
        System.out.println("Favor ingresa tu nombre de usuario:");
        String nombre = ingreso.nextLine();
        System.out.println("Hola " + nombre);
        ingreso.close();
    }
    
}