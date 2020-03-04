package herenciaDeudores;

public class PrestamoHipotecario extends ClienteDeudor{
    private double interesT, taza, i, j;

    public PrestamoHipotecario(String nombre,String numeroCu, double capital, int plazo){
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
    public double obtenerInteres(){

        i = 1 + 0.36/12;
        j = plazo * 12;
        interesT = capital * Math.pow(i, j);
        return interesT;
    }
}
