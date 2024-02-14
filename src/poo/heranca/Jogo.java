package poo.heranca;

public class Jogo {
    public static void main(String[] args) {
        Jogador louise = new Jogador();
        louise.andar(Direcao.LESTE);
        louise.andar(Direcao.NORTE);
        louise.andar(Direcao.OESTE);
        louise.andar(Direcao.OESTE);
        louise.andar(Direcao.OESTE);
        louise.andar(Direcao.SUL);
        System.out.println(louise.x);
    }
}
