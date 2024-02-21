package lambdas;

import java.util.function.Function;

public class Funcao {
    public static void main(String[] args) {
        Function<Integer, String> parOuImpar = numero -> numero % 2 == 0 ? "par" : "impar";
        System.out.println(parOuImpar.apply(45));

        Function<String, String> oResultadoEh = valor -> "O resultado é " + valor;

        Function<String, String> louise = valor -> valor + " Viu aí, LouLou? ";

        String resultadoFinal = parOuImpar.andThen(oResultadoEh).andThen(louise).apply(45);

        System.out.println(resultadoFinal);
    }
}
