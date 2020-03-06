package polimorfismoInversionistas;

public class Pagare2 extends Inversionista2 {
    double capital;

    /**
     * Metodo constructor del objeto Pagare
     * @param numeroCuenta
     * @param capital
     * @param nombre
     * @param plazo
     */
    public Pagare2(String numeroCuenta, double capital, String nombre, double plazo) {
        this.plazo = plazo;
        this.numeroCuenta = numeroCuenta;
        this.capital = capital;
        this.nombre = nombre;
    }

    /**
     *MEtodo para obtener el interes de Pagare
     * @return intereses
     */
    @Override
    public void obtenerIntereses() {
        intereses = capital * (taza / 100) * plazo;

    }
}
