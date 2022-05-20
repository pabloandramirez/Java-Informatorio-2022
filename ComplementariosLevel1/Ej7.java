import java.util.Scanner;

public class Ej7 {

    public static void main(String[] args) {
        Scanner ingreso = new Scanner(System.in);
        String palabra =ingreso.nextLine();
        char[] chars = palabra.toCharArray();
        for (char ch : chars) {
            int ascii = (int)ch - 32;
            char mayuscula = (char)ascii;
            System.out.print(mayuscula);
        }
        ingreso.close();

    }
}
