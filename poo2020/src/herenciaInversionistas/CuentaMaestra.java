package herenciaInversionistas;

public class CuentaMaestra extends Inversionista{
    private double capital;

    /**
     * Metodo constructor para el objeto cuenta maestra
     * @param numeroCuenta
     * @param capital
     * @param nombre
     * @param plazo
     */
    public CuentaMaestra(String numeroCuenta, double capital, String nombre, double plazo) {
        this.plazo = plazo;
        this.numeroCuenta = numeroCuenta;
        this.capital = capital;
        this.nombre = nombre;

    }

    /**
     * Metodo para obtener el interes de cuenta maestra
     * @return intereses
     */
    public double calcularIntereses(){
        double intereses;
         intereses = capital * (taza / 100) * plazo;
        return intereses;
    }
}
