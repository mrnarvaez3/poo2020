package polimorfismoFigura;

public class Cuadrado3 extends Figura3 {

    double ladoCuad;

    public Cuadrado3(double ladoCuad, String nombre){
        this.ladoCuad = ladoCuad;
        this.nombre = nombre;

    }


    @Override
    public void calcularArea() {
        area = Math.pow(ladoCuad, 2);
    }
}
