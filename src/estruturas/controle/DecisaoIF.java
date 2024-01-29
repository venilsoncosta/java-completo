package estruturas.controle;

import java.util.Scanner;

public class DecisaoIF {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite uma palavra qualquer: ");
        String palavra = entrada.next();
        if(palavra.contains("a")){
            System.out.println("A palavra contém a letra A");
        }
        entrada.close();
    }
}
