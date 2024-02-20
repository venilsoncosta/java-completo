package lambdas;

import java.util.function.Predicate;

public class Predicado {
    public static void main(String[] args) {
        Predicate<Produto> isCaro = produto -> (produto.preco * (1 - produto.desconto)) >= 1000;
        Produto produto2 = new Produto("Caneta", 23.56, 0.10);
        Produto computador = new Produto("Computador", 4897.87, 0.15);
        System.out.println(isCaro.test(produto2));
        System.out.println(isCaro.test(computador));
    }
}
