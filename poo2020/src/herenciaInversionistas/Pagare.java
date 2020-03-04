package herenciaInversionistas;

public class Pagare extends Inversionista {
    double capital;

    /**
     * Metodo constructor del objeto Pagare
     * @param numeroCuenta
     * @param capital
     * @param nombre
     * @param plazo
     */
    public Pagare(String numeroCuenta, double capital, String nombre, double plazo) {
        this.plazo = plazo;
        this.numeroCuenta = numeroCuenta;
        this.capital = capital;
        this.nombre = nombre;
    }

    /**
     *MEtodo para obtener el interes de Pagare
     * @return intereses
     */
    public double calcularIntereses(){
        double intereses;
        intereses = capital * (taza / 100) * plazo;
        return intereses;
    }
}
