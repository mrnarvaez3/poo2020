package herenciaFigura;

public class Cuadrado extends Figura{
    //  Declaracion de variables
    private double lado;
    private double areaCua;

    /**
     * Metodo constructor para el objeto Cuadrado
     * @param lado
     * @param nombre
     */
    public Cuadrado(double lado, String nombre){
        this.lado = lado;
        this.nombre = nombre;
    }


    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }


    public void setAreaCua(double areaCua) {
        this.areaCua = areaCua;
    }

    /**
     * Metodo para obtener area del cuadrado
     * @return areaCua
     */
    public double obtenerAreaCua(){
        areaCua = Math.pow(lado,2);
        return areaCua;
    }
}
