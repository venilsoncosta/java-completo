package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class DesafioMap {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        numeros.stream().map(Integer::toBinaryString)
                .map(n -> new StringBuilder(n).reverse().toString())
                .map(Integer::parseInt)
                .forEach(System.out::println);
    }
}
