import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner ingreso = new Scanner(System.in);
        System.out.println("Ingrese el numero para la secuencia:");
        Integer numero = ingreso.nextInt();
        for (int i = 1; i <= numero ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }
        ingreso.close();
    }
    
}

