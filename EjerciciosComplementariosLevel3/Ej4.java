import java.util.Set;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class Ej4 {

    public static long factorial(int n){
        return LongStream.rangeClosed(1, n)
            .reduce(1, (long x, long y) -> x*y);
    }

    public static void main(String[] args) {
        
        List<Integer> enteros = List.of(1, 2, 4, 4, 4);

        Set<Long> factorialEnteros = enteros.stream()
            .map(n -> factorial(n))
            .collect(Collectors.toSet());

        System.out.println(factorialEnteros);
            
    }
}