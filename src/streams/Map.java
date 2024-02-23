package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.function.UnaryOperator;

public class Map {
    public static void main(String[] args) {
        List<String> marcas = Arrays.asList("Ford", "Honda", "Toyota", "Fiat");
        marcas.stream().map(m -> m.toUpperCase()).forEach(System.out::println);

        /*
        UnaryOperator<String> maiuscula = n -> n.toUpperCase();
        UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + "";
        UnaryOperator<String> grito = n -> n + "!!!!! ";
        */

        marcas.stream()
                .map(Utilitarios.maiuscula)
                .map(Utilitarios.primeiraLetra)
                .map(Utilitarios.grito)
                .forEach(System.out::println);
    }
}
