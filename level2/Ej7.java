import java.util.ArrayList;
import java.util.Scanner;

public class Ej7 {

    private static ArrayList<String> lista = new ArrayList<>();
    private static Integer numero1;
    private static Integer numero2;
    private static Scanner ingreso = new Scanner(System.in);

    private static void fizzBuzzFuncion(Integer numero1, Integer numero2){
        for (int i = numero1; i < numero2; i++) {
            if (i % 3 == 0 && i % 2 == 0) {
                lista.add("FizzBuzz");
            } else if (i % 3 == 0) {
                lista.add("Buzz");
            } else if (i % 2 == 0) {
                lista.add("Fizz");
            } else {
                lista.add(String.valueOf(i));
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Favor de ingresar el primero numero: ");
        numero1 = ingreso.nextInt();
        System.out.println("Favor de ingresar el segundo numero: ");
        numero2 = ingreso.nextInt();
        if (numero1 < numero2) {
            fizzBuzzFuncion(numero1, numero2);
            System.out.println(lista);
        } else {
            System.out.println("El primer numero debe ser inferior al segundo");
        }
        
    }
    
}
