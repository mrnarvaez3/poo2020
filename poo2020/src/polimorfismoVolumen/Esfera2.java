package polimorfismoVolumen;

// clase hija de Figura
public class Esfera2 extends Figura2{
double radioEsfera;

    public Esfera2(double radio, String nombre){
        this.radioEsfera = radio;
        this.nombre = nombre;
    }


    @Override
    public void calcularVol() {
        vol = (4 * (3.1415 * Math.pow(radioEsfera,3))/3);
    }
}
