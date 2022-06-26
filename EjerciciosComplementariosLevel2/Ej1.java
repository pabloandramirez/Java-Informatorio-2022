import java.util.Scanner;
import java.util.ArrayList;

public class Ej1 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> ciudades = new ArrayList<String>();
        for (int index = 1; index < 4; index++) {
            String ciudad = scan.nextLine();
            ciudades.add(ciudad); 
        }
        for (int index = 0; index < ciudades.size(); index++) {
            System.out.println("#" + (index+1) + " - " + ciudades.get(index));
        }
        scan.close();


    }
}
