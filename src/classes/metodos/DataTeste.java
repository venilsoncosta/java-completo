package classes.metodos;

public class DataTeste {
    public static void main(String[] args) {
        Data d1 = new Data();
        d1.dia = 7;
        d1.mes = 8;
        d1.ano = 1991;
        System.out.println(d1.dia + "/" + d1.mes + "/" + d1.ano);
        d1.obterDataFormatada();
    }
}
