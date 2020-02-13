package deber_seleccion;

public class Estudiante {
    // delcaracion de variables
    private String nombre;
    private double calif1;
    private double calif2;
    private double calif3;
    private double calif4;
    private double promedio;
    private String observacion;

    /**
     * Metodo constructor para el objeto Estudiante
     * @param nombre1
     * @param calif11
     * @param calif21
     * @param calif31
     * @param calif41
     */
    public Estudiante(String nombre1, double calif11, double calif21, double calif31,
                      double calif41){
        this.nombre = nombre1;
        this.calif1 = calif11;
        this.calif2 = calif21;
        this.calif3 = calif31;
        this.calif4 = calif41;
    }

    /**
     * Metodo para obtener el promedio del estudiante
     * @return promedio
     */
    public double calcularPromedio(){
        promedio = (calif1 + calif2 + calif3 + calif4)/4;
     return promedio;
    }

    /**
     * Metodo para obtener la observacion del estudiante
     * @return observacion
     */
    public String calcularObservacion(){
        if (promedio >= 60){
            observacion = "Aprobado";
        } else{
            observacion = "Reprobado";
        }
        return observacion;
    }

    /**
     * metodo para obtener la salida de datos
     * @return cadena
     */
    public String presentar(){
        String cadena = String.format("Nombre: %S\nPromedio: %.2f \n" +
                "Observacion: %s", nombre, calcularPromedio(), calcularObservacion());
        return cadena;
    }
}
