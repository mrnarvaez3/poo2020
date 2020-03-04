package polimorfismoFigura;

public class Rectangulo3 extends Figura3 {

    double baseRecta;
    double alturaRecta;

    public Rectangulo3(double baseRecta, double alturaRecta, String nombre) {
        this.baseRecta = baseRecta;
        this.nombre = nombre;
        this.alturaRecta = alturaRecta;
    }

    @Override
    public void calcularArea() {
        area = baseRecta * alturaRecta;
    }
}
