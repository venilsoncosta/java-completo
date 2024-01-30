package arraysecolections;

import java.util.Arrays;

public class Exercicio {
    public static void main(String[] args) {
        double[] notas = new double[3];
        notas[0] = 3.7;
        notas[1] = 8.9;
        notas[2] = 9.2;
        System.out.println(Arrays.toString(notas));
        for(double nota : notas){
            System.out.println(nota);
        }

        System.out.println(notas[notas.length - 1]);
    }
}
