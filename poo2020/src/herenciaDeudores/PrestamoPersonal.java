package herenciaDeudores;

public class PrestamoPersonal extends ClienteDeudor{
    private double interesT;

    public PrestamoPersonal(String nombre,String numeroCu, double capital, int plazo){
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
    public double obtenerInteres(){
        interesT = capital * 9/100 * plazo;
        return interesT;
    }
}
