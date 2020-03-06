package polimorfismoVolumen;

// clase hija de Figura
public class Cubo2 extends Figura2 {
    double arista;

    /**
     * MEtodo constructor
     * @param arista
     * @param nombre
     */
    public Cubo2(double arista, String nombre){
        this.arista = arista;
        this.nombre = nombre;
    }


    @Override
    public void calcularVol() {
        vol = Math.pow(arista,3);
    }
}
