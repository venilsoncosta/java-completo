package classes.metodos;

public class AreaCirc {
    static final Double PI = 3.14;
    Double raio;

    public AreaCirc(Double raio) {
        this.raio = raio;
    }

    double area(){
        return raio * raio * PI;
    }
}
