package arraysecolections;

import java.util.Scanner;

public class DesafioArray {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite quantas notas o aluno teve: ");
        int quantidadeNotas = entrada.nextInt();
        double[] notas = new double[quantidadeNotas];
        for(int i = 0; i < notas.length; i++){
            System.out.println("Digite a nota: ");
            notas[i] = entrada.nextDouble();
        }
        double soma = 0;
        for (double d : notas) {
            soma += d;
        }
        double media = soma / notas.length;
        System.out.println("A média do aluno foi : " + media);


        entrada.close();
    }
}
