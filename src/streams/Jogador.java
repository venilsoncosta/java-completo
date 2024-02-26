package streams;

public class Jogador {
    final String nome;
    final int numeroCamisa;
    final String posicao;

    public Jogador(String nome, int numeroCamisa, String posicao) {
        this.nome = nome;
        this.numeroCamisa = numeroCamisa;
        this.posicao = posicao;
    }

    @Override
    public String toString() {
        return nome + " - posicao: " + posicao;
    }
}
