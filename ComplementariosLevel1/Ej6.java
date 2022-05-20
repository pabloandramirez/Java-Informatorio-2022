import java.util.Scanner;

public class Ej6 {
    public static void main(String[] args) {
        Scanner ingreso = new Scanner(System.in);
        System.out.print("Favor de ingresar el numero de la base: ");
        Integer numero_1 = ingreso.nextInt();
        System.out.print("Favor de ingresar el numero de la potencia: ");
        Integer numero_2 = ingreso.nextInt();
        Integer acumulador = 1;    
        for (int i = 1; i <= Math.abs(numero_2) ; i++) {
            acumulador *= Math.abs(numero_1);
        }
        if (numero_1<0 && (numero_2 % 2 !=0)) {
            acumulador = acumulador * (-1);
        }
        System.out.print(numero_1 + " elevado a " + numero_2 + " es igual a " + acumulador);
        ingreso.close();
    }
}
