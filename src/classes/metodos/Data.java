package classes.metodos;

public class Data {
    int dia;
    int mes;
    int ano;

    Data(){
        dia = 1;
        mes = 1;
        ano = 1970;
    }

    public Data(int dia, int mes, int ano){
        dia = dia;
        mes = mes;
        ano = ano;
    }

    String obterDataFormatada(){
        return String.format("%d/%d/%d", dia, mes, ano);
    }
}
