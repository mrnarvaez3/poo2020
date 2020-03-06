package polimorfismoInversionistas;

public class CuentaAhorro2 extends Inversionista2 {
    private double capital;

    /**
     * Metodo constructor del objeto Cuenta ahorro
     * @param numeroCuenta
     * @param capital
     * @param nombre
     * @param plazo
     */
    public CuentaAhorro2(String numeroCuenta, double capital, String nombre, double plazo ) {
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
    @Override
    public void obtenerIntereses() {
        intereses = capital * (taza / 100) * plazo;
    }
}
