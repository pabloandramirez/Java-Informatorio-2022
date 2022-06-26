import java.util.ArrayList;
import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        Scanner ingreso = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            int numero = ingreso.nextInt();
            numeros.add(numero);
        }
        imprimoElementos(numeros);
        System.out.println("Tamaño de lista ahora: " + numeros.size());
        numeros.add(0, 10);
        numeros.add(70);
        imprimoElementos(numeros);
        System.out.println("Tamaño de lista despues: " + numeros.size());
        ingreso.close();
    } 
    
    private static void imprimoElementos(ArrayList<Integer> lista){
        for (Integer elemento : lista) {
            System.out.print(elemento + " ");
        }
    }
    

}
