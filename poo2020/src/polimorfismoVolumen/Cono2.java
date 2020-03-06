package polimorfismoVolumen;

// clase hija de Figura
public class Cono2 extends Figura2 {
    double radioCono, alturaCono;

    /**
     * Metodo constructor
      * @param radioCono
     * @param alturaCono
     * @param nombre
     */
    public Cono2(double radioCono, double alturaCono, String nombre){
        this.radioCono = radioCono;
        this.alturaCono = alturaCono;
        this.nombre = nombre;
    }

    @Override
    public void calcularVol() {
        vol = (3.1415 * (Math.pow(radioCono,2) * alturaCono))*1/3;
    }
}
