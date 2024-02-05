package colecoes;

import java.util.HashSet;

public class ConjuntoBaguncado {
    public static void main(String[] args) {
        HashSet conjunto = new HashSet();
        conjunto.add(1.23); // vai automaticamente transformar de double pra Double. de primitivo pra classe.
        conjunto.add(true);
        conjunto.add("Louise");
        conjunto.add('x');

        //não aceita repetição

        System.out.println(conjunto.size());
        System.out.println("Verificando se removeu algo: " + conjunto.remove(true));
        System.out.println("Verificando se há um determinado elemento: " + conjunto.contains("Louise"));
        System.out.println(conjunto.size());
    }
}
