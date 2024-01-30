package desafios;

public class Jantar {
    public static void main(String[] args) {
        Pessoa louise = new Pessoa("Louise", 60.0);
        Comida feijao = new Comida("feijão", 1.27);
        louise.comer(feijao);
        System.out.println(louise.peso);
    }
}
