package herenciaInversionistas;

public class CuentaAhorro extends Inversionista {
    private double capital;

    /**
     * Metodo constructor del objeto Cuenta ahorro
     * @param numeroCuenta
     * @param capital
     * @param nombre
     * @param plazo
     */
    public CuentaAhorro(String numeroCuenta, double capital, String nombre, double plazo ) {
        this.capital = capital;
        this.numeroCuenta = numeroCuenta;
        this.nombre = nombre;
        this.plazo = plazo;
        this.taza = getTaza();
    }

    /**
     * Metodo para obtener el interes de una cuenta de ahorro
     * @return intereses
     */
    public double calcularIntereses(){
        double intereses;
        intereses = capital * (taza / 100) * plazo;
        return intereses;
    }
}
