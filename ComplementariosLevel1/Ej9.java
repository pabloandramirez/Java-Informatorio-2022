import java.util.Scanner;

public class Ej9 {
    static Scanner ingreso = new Scanner(System.in);
    public static void main(String[] args) {
        print("Ingresar el texto para analizar:");
        String texto = ingreso.nextLine();
        print("Ingrese la letra que desea contabilizar:");
        char caracter = ingreso.next().charAt(0);
        Integer contador = 0;
        for (int i = 0; i < texto.length(); i++) {
            if (caracter == texto.charAt(i)) {
                contador += 1;
            }
        }
        print("El caracter aparece " + contador + " veces");
    }

    private static void print(String mensaje){
        System.out.println(mensaje);
    }
}
