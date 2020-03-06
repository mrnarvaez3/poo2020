package polimorfismoVolumen;

// clase hija de Figura
public class Cilindro2 extends Figura2{
    double radioCili, alturaCili;
    /**
     * Metodo constructor
     * @param radio
     * @param alturaCili
     * @param nombre
     */
    public Cilindro2(double radio, double alturaCili, String nombre){
        this.radioCili = radio;
        this.alturaCili = alturaCili;
        this.nombre = nombre;
    }

    @Override
    public void calcularVol() {
        vol = (3.1415 * Math.pow(radioCili,2) * alturaCili);
    }
}
