package arraysecolections;

import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual a quantidade de alunos? ");
        int quantidadeAlunos = entrada.nextInt();
        System.out.println("Qual a quantidade de notas?");
        int quantidadeNotas = entrada.nextInt();
        double[][] notas = new double[quantidadeAlunos][quantidadeNotas];

        double total = 0;

        for (int i = 0; i < notas.length; i++){
            for (int j = 0; j < notas[i].length; j++){
                System.out.println("Informe as notas: ");
                notas[i][j] = entrada.nextDouble();
                total += notas[i][j];
            }
        }
        double media = total / (quantidadeAlunos * quantidadeNotas);
        
        System.out.println("A média da turma foi: " + media);

        int a = 57;
        int b = 57;
        System.out.println(a == b);
    }
}
