package poo.composicao;

public class Motor {
    boolean ligado = false;
    Double fatorInjecao = 1.0;

    int giros(){
        if(!ligado){
            return 0;
        }else{
            return (int) Math.round(fatorInjecao * 3000);
        }
    }
}
