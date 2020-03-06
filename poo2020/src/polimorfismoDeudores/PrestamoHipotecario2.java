package polimorfismoDeudores;

public class PrestamoHipotecario2 extends ClienteDeudor2 {
    private double i, j;

    public PrestamoHipotecario2(String nombre, String numeroCu, double capital, int plazo){
        this.nombre = nombre;
        this.numeroCu = numeroCu;
        this.capital = capital;
        this.plazo = plazo;
    }

    /**
     * Metodo para obtener el interes compuesto anual
     * con una taza de 15%
     * @return
     */
    @Override
    public void calcularinteres() {
        i = 1 + 0.36/12;
        j = plazo * 12;
        interes = capital * Math.pow(i, j);

    }
}
