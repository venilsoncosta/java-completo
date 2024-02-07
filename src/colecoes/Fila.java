package colecoes;


import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {
        Queue<PessoaTeste> teste = new LinkedList<>();
        PessoaTeste pessoa1 = new PessoaTeste("Louise");
        teste.add(pessoa1);
        teste.add(new PessoaTeste("venilson"));
        teste.add(new PessoaTeste("Luis"));
        System.out.println(teste.toString());
    }
}
