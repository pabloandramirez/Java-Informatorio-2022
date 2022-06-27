import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Ej1
 */
public class Ej1 {

    public static void main(String[] args) {
        List<String> palabras = new ArrayList<>();
        palabras.add("Hola");
        palabras.add(null);
        palabras.add("Informatorio");
        palabras.add("");

        List<String> listaSinNulos = palabras.stream()
            .filter(x -> x!= null)
            .filter(x -> x != "")
            .collect(Collectors.toList());
        System.out.println(listaSinNulos);
            
    }
}