package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce1 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(13453, 27456, 37473562, 45435, 568765, 6324, 567, 832, 9753);
        BinaryOperator<Integer> soma = (total, n) -> total + n;
        int total1 = numeros.stream()
                            .reduce(soma)
                            .get();

        System.out.println(total1);
    }
}
