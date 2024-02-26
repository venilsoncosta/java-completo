package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class JogadorDesafio {
    public static void main(String[] args) {
        Jogador j1 = new Jogador("Calleri", 9, "atacante");
        Jogador j2 = new Jogador("Lucas", 7, "meia");
        Jogador j3 = new Jogador("James", 10, "meia");
        Jogador j4 = new Jogador("Erick", 23, "atacante");
        Jogador j5 = new Jogador("Ferreirinha", 17, "atacante");
        Jogador j6 = new Jogador("Luis Fabiano", 99, "atacante");
        Jogador j7 = new Jogador("Arboleda", 5, "zagueiro");
        Jogador j8 = new Jogador("Nestor", 8, "meia");
        Jogador j9 = new Jogador("Rato", 34, "meia");

        List<Jogador> jogadores = Arrays.asList(j1, j2, j3, j4, j5, j6, j7, j8, j9);
        Predicate<Jogador> numeroBaixoCamisa = j -> j.numeroCamisa < 15;
        Predicate<Jogador> letraNoNome = j -> j.nome.contains("a");

        jogadores.stream()
                .filter(numeroBaixoCamisa)
                .filter(letraNoNome)
                .forEach(System.out::println);
    }
}
