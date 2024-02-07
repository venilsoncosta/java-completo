package colecoes;

public class PessoaTeste {
    String nome;

    public PessoaTeste(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "PessoaTeste{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
