package herenciaDeudores;

public class ClienteDeudor {
    protected String nombre;
    protected String numeroCu;
    protected double capital;
    protected int plazo;


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
}
