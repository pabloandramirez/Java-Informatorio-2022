import java.util.Scanner;

public class Ej5 {
    static Scanner ingreso = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Favor de ingresar el primer numero: ");
        Integer numero_1 = ingreso.nextInt();
        System.out.print("Favor de ingresar el segundo numero: ");
        Integer numero_2 = ingreso.nextInt();
        Integer acumulador = 0;
        for (int i = 1; i <= Math.abs(numero_2) ; i++) {
            acumulador += Math.abs(numero_1);
        }
        if (numero_1<0 && numero_2>0  || numero_1>0 && numero_2<0) {
            acumulador = acumulador * (-1);
        }
        System.out.println(numero_1 + " * " + numero_2 + " = " + acumulador);
    }
}
