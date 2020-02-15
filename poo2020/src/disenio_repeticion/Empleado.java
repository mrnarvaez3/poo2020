package disenio_repeticion;

public class Empleado {
    // Declaracion de variables
    String nombre;
    int horas;
    double cuota;
    double sueldo;

    /**
     * Constructor de empleado
     * @param nombre1
     * @param horas1
     */
    public Empleado(String nombre1, int horas1) {
        this.nombre = nombre1;
        this.horas = horas1;
    }
    /**
     * metodo para obtener el sueldo total a pagar
     * @return sueldo
     */
    public double establecerSueldo(double cuota){
        if(horas<= 40){
            sueldo = horas * cuota;
        } else{
            sueldo = (40 * cuota) + ((horas-40) * (cuota*2));
        }
        return sueldo;
    }
}
