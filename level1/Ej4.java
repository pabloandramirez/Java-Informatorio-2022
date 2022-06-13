import java.util.Scanner;

public class Ej4 {
    
    public static void main(String[] args) {
        Scanner ingreso = new Scanner(System.in);
        System.out.println("Ingrese el numero para calcular el factorial:");
        Integer numero = ingreso.nextInt();
        Integer contador = 1;
        for (int i = 1; i <= numero; i++) {
            contador *= i;
        }
        System.out.println("El factorial de " + numero + " es " + contador);
        ingreso.close();
    }
}
