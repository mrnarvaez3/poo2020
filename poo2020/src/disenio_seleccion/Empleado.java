package disenio_seleccion;

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
     * @param cuota1
     */
    public Empleado(String nombre1, int horas1, double cuota1) {
        this.nombre = nombre1;
        this.horas = horas1;
        this.cuota = cuota1;
    }

    /**
     * metodo para obtener el sueldo total a pagar
     * @return sueldo
     */
    public double establecerSueldo(){
        if(horas<= 40){
            sueldo = horas * cuota;
        } else {

            sueldo = (40 * cuota) + ((horas-40) * (cuota*2));
        }
        return sueldo;
    }

    /**
     * metodo para obtener la salida de datos
     * @return cadena
     */
    public String presentar(){
        String cadena = String.format("Nombre del empleado: %s\nSueldo total: " +
                "%.2f $", nombre, establecerSueldo());
        return cadena;
    }
}