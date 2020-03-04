package polimorfismoFigura;

public class Triangulo3 extends Figura3{
    double baseTria;
    double alturaTria;
    public Triangulo3(double baseTria, double alturaTria, String nombre) {
        this.baseTria = baseTria;
        this.alturaTria = alturaTria;
        this.nombre = nombre;
    }


    @Override
    public void calcularArea() {
        area = (baseTria * alturaTria)/2;
    }
}
