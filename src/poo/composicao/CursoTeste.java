package poo.composicao;

public class CursoTeste {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Louise");
        Aluno aluno2 = new Aluno("Venilson");
        Aluno aluno3 = new Aluno("Vívia");

        Curso curso1 = new Curso("Java");
        Curso curso2 = new Curso("C#");
        Curso curso3 = new Curso("Python");

        curso1.adicionarAluno(aluno1);
        curso1.adicionarAluno(aluno2);

        curso3.adicionarAluno(aluno1);
        curso3.adicionarAluno(aluno3);

        for(Aluno aluno: curso1.alunos){
            System.out.println("Estou matriculado no curso " + curso1.nome);
            System.out.println("Meu nome é " + aluno.nome);
        }
    }
}
