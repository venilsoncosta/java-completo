package poo.composicao;

public class CompraTeste {
    public static void main(String[] args) {
        Compra c1 = new Compra();
        c1.itens.add(new Item("caneta", 20, 2.45));
        c1.itens.add(new Item("Computador", 1, 3056.07));
        System.out.println(c1.obterValorTotal());
    }
}
