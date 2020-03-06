package polimorfismoDeudores;

public class PrestamoAuto2 extends ClienteDeudor2 {

    public PrestamoAuto2(String nombre, String numeroCu, double capital, int plazo){
        this.nombre = nombre;
        this.numeroCu = numeroCu;
        this.capital = capital;
        this.plazo = plazo;
    }

    /**
     * Metodo para obtener el Interes Simple anual
     * con una taza de 15%
     * @return
     */
    @Override
    public void calcularinteres() {
        interes = capital * 15/100 * plazo;
    }
}
