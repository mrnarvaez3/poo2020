package polimorfismoDeudores;

public abstract class ClienteDeudor2 {
    protected String nombre;
    protected String numeroCu;
    protected double capital;
    protected int plazo;
    protected double interes;



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroCu() {
        return numeroCu;
    }

    public void setNumeroCu(String numeroCu) {
        this.numeroCu = numeroCu;
    }

    public double getCapital() {
        return capital;
    }

    public void setCapital(double capital) {
        this.capital = capital;
    }

    public int getPlazo() {
        return plazo;
    }

    public void setPlazo(int plazo) {
        this.plazo = plazo;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public abstract void calcularinteres();

}
