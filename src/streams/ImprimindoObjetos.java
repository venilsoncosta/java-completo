package streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ImprimindoObjetos {
    public static void main(String[] args) {
        List<String> aprovados = Arrays.asList("Raiza", "Louise", "Venilson", "Lucas", "Cássia");

        System.out.println("Usando foreach");
        for(String nome : aprovados){
            System.out.println(nome);
        }
        System.out.println();
        System.out.println("\n");
        System.out.println("Usando iterator");
        Iterator<String> iterator = aprovados.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("\nStreams");
        aprovados.forEach(System.out::println);
    }
}
