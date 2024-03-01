package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Match {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Louise", 7.8);
        Aluno a2 = new Aluno("Lucas", 8.8);
        Aluno a3 = new Aluno("LouLou", 5.8);
        Aluno a4 = new Aluno("Lorena", 3.8);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);

        Predicate<Aluno> aprovado = a -> a.nota >= 7;

        System.out.println(alunos.stream().anyMatch(aprovado));
        System.err.println();
    }
}
