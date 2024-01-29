package desafios;

public class TesteValoresprimitivos {
    public static void main(String[] args) {
        int a = 3;
        int b = a;
        a++;
        b--;
        System.out.println(a);
        System.out.println(b);

        //atribuição por tipos primitivos eu faço uma cópia. O que eu alterar em a não vai afetar em b.
        //Mas se fosse com objetos, tudo que eu alterasse em um objeeto alteraria também em outro, que é
        //atribuição por referência
    }
}
