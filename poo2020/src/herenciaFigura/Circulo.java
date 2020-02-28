package herenciaFigura;

public class Circulo extends Figura{
    // Declaracion de variables
    private double radio;
    private double areaCir;

    /**
     * Metodo constructor para el objeto circulo
     * @param radio
     * @param nombre
     */
    public Circulo(double radio, String nombre){
        this.nombre = nombre;
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void setAreaCir(double areaCir) {
        this.areaCir = areaCir;
    }

    /**
     * Metodo para obtener el area del circulo
     * @return areaCir
     */
    public double obtenerAreaCir(){
        areaCir = (3.1415 * Math.pow(radio, 2));
        return areaCir;
    }
}
