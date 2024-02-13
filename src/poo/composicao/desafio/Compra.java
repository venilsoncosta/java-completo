package poo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {
    List<Item> itens = new ArrayList<>();

    void adicionarItem(int quantidade, Produto p){
        this.itens.add(new Item(quantidade, p));
    }

    double obterValorTotal(){
        double total = 0;
        for(Item item : itens){
            total += item.quantidade * item.produto.preco;
        }
        return total;
    }
}
