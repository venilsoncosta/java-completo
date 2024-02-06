package colecoes;

import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {
        Map<Integer, String> lista1 = new HashMap<Integer, String>();
        lista1.put(1, "Louise");
        lista1.put(2, "Lorena");
        lista1.put(3, "Luis");
        lista1.put(4, "Lucas");
        System.out.println(lista1.toString());
    }
}
