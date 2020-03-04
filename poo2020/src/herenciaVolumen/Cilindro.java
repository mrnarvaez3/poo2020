package herenciaVolumen;
// clase hija de Figura
public class Cilindro extends Figura{
    double radioCili, alturaCili, areaCili;

    /**
     * Metodo constructor
     * @param radio
     * @param alturaCili
     * @param nombre
     */
    public Cilindro(double radio, double alturaCili, String nombre){
        this.radioCili = radio;
        this.alturaCili = alturaCili;
        this.nombre = nombre;
    }

    public double volumenCilindro(){
        areaCili = (3.1415 * Math.pow(radioCili,2) * alturaCili);
        return areaCili;
    }
}
