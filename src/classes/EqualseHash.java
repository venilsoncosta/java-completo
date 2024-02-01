package classes;

public class EqualseHash {
    public static void main(String[] args) {
        Usuario u1 = new Usuario();
        u1.nome = "louise";

        Usuario u2 = new Usuario();
        u2.nome = "louise";
        System.out.println(u2.equals(u1));

    }
}
