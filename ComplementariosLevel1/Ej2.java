import java.util.Scanner;


public class Ej2 {
    public static void main(String[] args) {
        Scanner ingreso = new Scanner(System.in);
        print("Ingresa el primer valor:");
        Integer numero_1 = ingreso.nextInt();
        print("Ingresa el segundo valor:");
        Integer numero_2 = ingreso.nextInt();
        print(numero_1 + " + " + numero_2 + " = " + (numero_1+numero_2));
        print(numero_1 + " - " + numero_2 + " = " + (numero_1-numero_2));
        print(numero_1 + " * " + numero_2 + " = " + (numero_1*numero_2));
        print(numero_1 + " / " + numero_2 + " = " + (numero_1/numero_2));
        print(numero_1 + " % " + numero_2 + " = " + (numero_1%numero_2));
        ingreso.close();
    }

    private static void print(String mensaje){
        System.out.println(mensaje);
    }
}
