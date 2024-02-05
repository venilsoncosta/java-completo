package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoOrganizado {
    public static void main(String[] args) {
        Set<String> lista = new HashSet<String>();
        lista.add("Louise");
        lista.add("Lorena");
        lista.add("Lucas");
        lista.add("Luiz");
        System.out.println(lista.toString());

        for(String nome : lista){
            System.out.println(nome);
        }
    }
}
