package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinMax {
    public static void main(String[] args) {
        Aluno b1 = new Aluno("Elo", 7.8);
        Aluno b2 = new Aluno("Lucas", 8.8);
        Aluno b3 = new Aluno("LouLou", 5.8);
        Aluno b4 = new Aluno("Lorena", 3.8);

        List<Aluno> alunos = Arrays.asList(b1, b2, b3, b4);

        Comparator<Aluno> melhorNota = (aluno1, aluno2) -> {
            if(aluno1.nota > aluno2.nota) return 1;
            if(aluno1.nota < aluno2.nota) return -1;
            return 0;
        };
        System.out.println(alunos.stream().max(melhorNota).get());
    }
}
