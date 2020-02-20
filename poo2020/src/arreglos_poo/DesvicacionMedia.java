package arreglos_poo;

public class DesvicacionMedia {
    // declaracion de variables
    private double [] num = new double[15];
    private double promedio = 0;
    private  double []desviacion = new double[15];
    private double acum = 0;
    private String cadena = "Numero\t\tDesviacion\n";

    public DesvicacionMedia(double [] numeros){
        num = numeros;
    }

    /**
     *  metodo para obtener el promedio
     * @return promedio
     */
    public double obtenerPromedio(){
        promedio = 0;
        acum = 0;
        for (int i = 0; i < 15; i++) {
            acum = acum + num[i];
        }
        promedio = acum/ num.length;
        return promedio;
    }

    /**
     * metodo para obtener la desviacion
     * @return
     */
    public double [] obtenerdesviacion(){
        for (int i = 0; i < num.length; i++) {
            desviacion[i] = num[i] - obtenerPromedio();
        }
        return  desviacion;
    }

    /**
     * metodo para obtener la salida de datos
     * @return
     */
    public String presentar(){
        for (int i = 0; i < num.length; i++) {
            cadena = String.format("%s%.2f\t\t%.2f\n",cadena,num[i],obtenerdesviacion()[i]);
        }
        cadena = String.format("%sMedia = \t%.2f",cadena,obtenerPromedio());
        return cadena;
    }
}
