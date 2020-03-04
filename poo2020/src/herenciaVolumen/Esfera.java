package herenciaVolumen;
    // clase hija de Figura
public class Esfera extends Figura{
    double radioEsfera, areaEsfe;

    public Esfera(double radio, String nombre){
        this.radioEsfera = radio;
        this.nombre = nombre;
    }

    public double volumenEsfe(){
        areaEsfe = 4/3 *(3.1415 * Math.pow(radioEsfera,3));
        return areaEsfe;
    }
}
