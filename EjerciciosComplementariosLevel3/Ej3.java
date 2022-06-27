import java.util.List;
import java.util.stream.Collectors;

public class Ej3 {
    
    public static void main(String[] args) {
        
        List<String> superheroes = List.of("Batman", "Aquaman", "Flash", "Batgirl"
        , "Wonder Woman", "brainiac");

        List<String> empiezanConB = superheroes.stream()
            .filter(x -> x.toLowerCase().startsWith("b"))
            .collect(Collectors.toList());

        System.out.println(empiezanConB.size());
    }
}
