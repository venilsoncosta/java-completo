package lambdas;

import java.util.Arrays;
import java.util.List;

public class ForEach {
    public static void main(String[] args) {
        List<String> aprovados = Arrays.asList("Louise", "Venilson", "Raiza", "Lucas", "Frete", "Heitor",
                "Cunhado");
        for(String nome: aprovados){
            System.out.println(nome);
        }
        System.out.println("\n lambdas");
        aprovados.forEach((nome) -> {
            System.out.println(nome + "!!!");
        });

        System.out.println("Forma mais curta ainda");
        aprovados.forEach(System.out::println);
    }
}
