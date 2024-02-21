package lambdas;

import java.util.function.Predicate;

public class PredicadoComposicao {
    public static void main(String[] args) {
        Predicate<Integer> isPar = numero -> numero % 2 == 0;
        Predicate<Integer> isTresDigitos = numero -> numero >= 100 && numero <= 999;
        System.out.println(isPar.and(isTresDigitos).test(340));
        //posso unir funções dessa forma, desde que sejam pequenas. Posso reutilizá-las em outras partes do
        // código.
    }
}
