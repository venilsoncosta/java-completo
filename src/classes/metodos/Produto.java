package classes.metodos;

public class Produto {
    String nome;
    Double preco;
    static Double desconto = 0.25;

    Produto(){

    }

    Produto( String novoNome, Double novoPreco){
        nome = novoNome;
        preco = novoPreco;
    }

    double precoComDesconto(){
        return preco * (1 - desconto);
    }
}
