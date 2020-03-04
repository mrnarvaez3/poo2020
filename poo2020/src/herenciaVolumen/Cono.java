package herenciaVolumen;
// clase hija de Figura
public class Cono extends Figura{
    double radioCono, alturaCono, areaCono;

    /**
     * Metodo constructor
      * @param radioCono
     * @param alturaCono
     * @param nombre
     */
    public Cono(double radioCono, double alturaCono, String nombre){
        this.radioCono = radioCono;
        this.alturaCono = alturaCono;
        this.nombre = nombre;
    }

    public double volumenCono(){
        areaCono = (3.1415 * (Math.pow(radioCono,2) * alturaCono))*1/3;
        return areaCono;
    }
}
