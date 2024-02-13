package poo.composicao.desafio;

import java.util.List;

public class CompraTeste {
    public static void main(String[] args) {
        Produto produto1 = new Produto("caneta", 3.56);
        Produto produto2 = new Produto("borracha", 2.45);
        Produto produto3 = new Produto("caderno", 30.0);

        Item item1 = new Item(3, produto2);
        Compra compra1 = new Compra();
        compra1.adicionarItem(3, produto2);
        compra1.adicionarItem(3, produto3);
        Cliente cliente1 = new Cliente("Louise");
        System.out.println(cliente1.obterValorTotal());
    }
}
