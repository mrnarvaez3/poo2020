package polimorfismoVolumen;
// Clase maestra volumen

public abstract class Figura2 {
    protected String nombre;
    protected double vol;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }

    public double getVol() {
        return vol;
    }

    public abstract void calcularVol();
}
