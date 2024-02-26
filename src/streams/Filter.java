package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Louise", 10.0);
        Aluno a2 = new Aluno("Lucas", 6.0);
        Aluno a3 = new Aluno("Loue", 5.0);
        Aluno a4 = new Aluno("Lise", 9.0);
        Aluno a5 = new Aluno("LouLou", 7.1);
        Aluno a6 = new Aluno("Looola", 3.0);
        Aluno a7 = new Aluno("Luluise", 4.6);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6, a7);

        Predicate<Aluno> aprovado = a -> a.nota >= 7.0;
        Function<Aluno, String> saudacaoAprovacao = a -> "parabéns " + a.nome + "! você foi aprovado";

        alunos.stream()
                .filter(aprovado)
                .map(saudacaoAprovacao)
                .forEach(System.out::println);
    }
}
