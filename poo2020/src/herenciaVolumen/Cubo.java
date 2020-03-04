package herenciaVolumen;
// clase hija de Figura
public class Cubo extends Figura{
    double arista, areaCubo;

    /**
     * MEtodo constructor
     * @param arista
     * @param nombre
     */
    public Cubo(double arista, String nombre){
        this.arista = arista;
        this.nombre = nombre;
    }

    public double volumenCubo(){
        areaCubo = Math.pow(arista,3);
        return areaCubo;
    }

}
