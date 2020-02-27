package herencia_empleado;

public class EmpleadoPorHora extends Empleado{
    //  declaracion de variables
    int hora;
    double valorHora;
    double sueldo;
    //  metodo constructor para el objeto empleado por horas
    public EmpleadoPorHora(String nombre, String cargo, String dependencia, int hora, double valorHora) {
        this.hora = hora;
        this.valorHora = valorHora;
        this.nombre = nombre;
        this.cargo = cargo;
        this.dependencia = dependencia;
    }

    /**
     *  metodo para obtener el sueldo por horas
     * @return sueldo
     */
    public double calcularSueldoHoras(){
        sueldo = valorHora * hora;
        return sueldo;
    }

    /**
     * Metodo para obtener la salida de datos
     */
    public void presentar(){
        System.out.printf("Empleado: %s\nCargo: %s\nDependencia: %s" +
                "\nSueldo: %.2f", getNombre(), getCargo(), getDependencia(), calcularSueldoHoras());
    }
}
