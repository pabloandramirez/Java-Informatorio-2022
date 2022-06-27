import java.util.List;
import java.util.stream.Collectors;

public class Ej2 {
    
    public static void main(String[] args) {
        List<Integer> enteros = List.of(1, 2, 3, 4, 5);

        List<Integer> enterosAlCuadrado = enteros.stream()
            .map(x -> x*x)
            .collect(Collectors.toList());

        System.out.print(enterosAlCuadrado);
    }
}
