import java.util.ArrayList;
import java.util.Collections;

public class Ej3 {
    public static void main(String[] args) {
        ArrayList<Integer> valores = new ArrayList<Integer>();
        for (int index = 1; index < 14; index++) {
            valores.add(index);
        }
        System.out.println(valores);
        Collections.reverse(valores);
        System.out.println(valores);
        Collections.shuffle(valores);
        System.out.println(valores);
    }
}
