package herenciaDeudores;

public class PrestamoAuto extends ClienteDeudor {
    private double interesT, taza;

    public PrestamoAuto(String nombre,String numeroCu, double capital, int plazo){
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
    public double obtenerInteres(){
        interesT = capital * 15/100 * plazo;
        return interesT;
    }
}
