package desafios;

public class Pessoa {
    String nome;
    Double peso;

    public Pessoa(String nome, Double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    public void comer(Comida comida){
        this.peso += comida.getPeso();
    }
}
