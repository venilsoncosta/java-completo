package fundamentos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AdicionandoNaLista {
    public static void main(String[] args) {
        List<String> listaDePalavras = new ArrayList<>();
        int contador = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Diga quantas palavras você quer adicionar: ");
        int quantidade = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Digite as palavras.");
        while (contador < quantidade){
            listaDePalavras.add(entrada.nextLine());
            contador++;
        }
        listaDePalavras.forEach(System.out::println);

    }

}
