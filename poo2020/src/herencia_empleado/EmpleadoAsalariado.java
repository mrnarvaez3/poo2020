package herencia_empleado;

public class EmpleadoAsalariado extends Empleado {
    // Declaracion de variables
    double valorMensual;
    double sueldo;
    //  Constructor del objeto Empleado Asalariado
    public EmpleadoAsalariado(double valorMensual,String nombre, String cargo, String dependencia) {
        this.valorMensual = valorMensual;
        this.nombre = nombre;
        this.cargo = cargo;
        this.dependencia = dependencia;
    }

    /**
     * metodo para obtener sueldo Asalariado
     * @return sueldo
     */
    public double calcularSueldoAsalariado(){
        sueldo = valorMensual;
        return sueldo;
    }

    /**
     * Metodo para obtener salida de datos
     */
    public void presentar(){
        System.out.printf("Empleado: %s\n Cargo: %s\nDependencia: " +
                "%s\nSueldo: %.2f", getNombre(), getCargo(), getDependencia(), calcularSueldoAsalariado());
    }

}
