package polimorfismoInversionistas;

public class CuentaMaestra2 extends Inversionista2 {
    private double capital;

    /**
     * Metodo constructor para el objeto cuenta maestra
     * @param numeroCuenta
     * @param capital
     * @param nombre
     * @param plazo
     */
    public CuentaMaestra2(String numeroCuenta, double capital, String nombre, double plazo) {
        this.plazo = plazo;
        this.numeroCuenta = numeroCuenta;
        this.capital = capital;
        this.nombre = nombre;

    }

    /**
     * Metodo para obtener el interes de cuenta maestra
     * @return intereses
     */
    @Override
    public void obtenerIntereses() {
        intereses = capital * (taza / 100) * plazo;

    }
}
