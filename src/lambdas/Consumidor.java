package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
    public static void main(String[] args) {
        Consumer<Produto> imprimir = p -> System.out.println(p.nome);
        Produto tv = new Produto("televisão", 2345.67, 0.15);
        imprimir.accept(tv);

        Produto celular = new Produto("celular", 2869.00, 0.11);
        Produto computador = new Produto("computador", 2869.00, 0.11);
        Produto caderno = new Produto("caderno", 2869.00, 0.11);
        Produto geladeira = new Produto("geladeira", 2869.00, 0.11);

        List<Produto> produtos = Arrays.asList(tv, celular, computador, caderno, geladeira);
        System.out.println("O objeto inteiro");
        produtos.forEach(System.out::println); // nessa linha ele vai mostrar o objeto inteiro
        System.out.println();
        System.out.println("Somente o nome");

        produtos.forEach(imprimir); // nessa linha ele vai mostrar somente o nome do bjeto, como defini lá em
        // cima
        System.out.println("O preço");
        produtos.forEach(p -> System.out.println(p.preco)); // aqui ele vai mostrar o preço
    }
}
