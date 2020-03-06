package polimorfismoDeudores;

public class PrestamoPersonal2 extends ClienteDeudor2 {

    public PrestamoPersonal2(String nombre, String numeroCu, double capital, int plazo){
        this.nombre = nombre;
        this.numeroCu = numeroCu;
        this.capital = capital;
        this.plazo = plazo;
    }
    /**
     * Metodo para obtener interes simple en anios
     * con una taza de 9%
     * @return
     */
    @Override
    public void calcularinteres() {
        interes = capital * 9/100 * plazo;
    }
}
