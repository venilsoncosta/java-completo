package classes.metodos;

public class ProdutoTeste {
    public static void main(String[] args) {
        Produto notebook = new Produto("Notebook", 2500.00);
        //notebook.precoComDesconto();
        System.out.println(notebook.precoComDesconto());
    }
}
