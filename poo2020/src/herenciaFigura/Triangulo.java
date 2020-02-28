package herenciaFigura;

public class Triangulo extends Figura{
    // Declaracion de variables
    private Double baseTria;
    private Double alturaTria;
    private Double areaTria;

    /**
     * Metodo constructor del objeto Triangulo
     * @param baseTria
     * @param alturaTria
     * @param nombre
     */
    public Triangulo(double baseTria, double alturaTria, String nombre){
        this.baseTria = baseTria;
        this.alturaTria = alturaTria;
        this.nombre = nombre;
    }

    public Double getBaseTria() {
        return baseTria;
    }

    public void setBaseTria(Double baseTria) {
        this.baseTria = baseTria;
    }

    public Double getAlturaTria() {
        return alturaTria;
    }

    public void setAlturaTria(Double alturaTria) {
        this.alturaTria = alturaTria;
    }

    public void setAreaTria(Double areaTria) {
        this.areaTria = areaTria;
    }

    /**
     * Metodo para obtener area del triangulo
     * @return areaTria
     */
    public double calcularAreaTria(){
        areaTria = (baseTria * alturaTria)/2;
        return areaTria;
    }

}
