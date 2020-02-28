package herenciaFigura;

public class Rectangulo extends Figura{
    //  Declaracion de variables
    private double baseRec;
    private double alturaRec;
    private double areaRec;

    /**
     * Metodo constructor para objeto Rectangulo
     * @param baseRec
     * @param alturaRec
     * @param nombre
     */
    public Rectangulo(double baseRec, double alturaRec, String nombre){
        this.baseRec = baseRec;
        this.alturaRec = alturaRec;
        this.nombre = nombre;
    }


    public double getBaseRec() {
        return baseRec;
    }

    public void setBaseRec(double baseRec) {
        this.baseRec = baseRec;
    }

    public double getAlturaRec() {
        return alturaRec;
    }

    public void setAlturaRec(double alturaRec) {
        this.alturaRec = alturaRec;
    }

    public void setAreaRec(double areaRec) {
        this.areaRec = areaRec;
    }

    /**
     * Metodo para obtener area del rectangulo
     * @return areaRec
     */
    public double obtenerAreaRec(){
        areaRec = baseRec * alturaRec;
        return areaRec;
    }
}
