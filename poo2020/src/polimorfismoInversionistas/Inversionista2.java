package polimorfismoInversionistas;
//  Clase maestra Inversionista
public abstract class Inversionista2 {
    // Declaracion de variables
    protected String nombre;
    protected double plazo;
    protected double taza = 3;
    protected String numeroCuenta;
    protected double intereses;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPlazo() {
        return plazo;
    }

    public void setPlazo(double plazo) {
        this.plazo = plazo;
    }

    public double getTaza() {
        return taza;
    }

    public void setTaza(double taza) {
        this.taza = taza;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
    public double getIntereses() {
        return intereses;
    }

    public abstract void obtenerIntereses();

}
