package fundamentos;

import java.util.Scanner;

public class Wrapper {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = Integer.parseInt(entrada.next());
        System.out.println("Seu numero " + numero + " somado a 8 é " + (numero + 8));

        Boolean boleano = Boolean.parseBoolean("false");
        System.out.println(boleano.toString().toUpperCase()); //posso transformar de boolean pra string dessa forma.
    }
}
