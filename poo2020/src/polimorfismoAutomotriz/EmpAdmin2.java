package polimorfismoAutomotriz;

// Clase hija de Empleado
public class EmpAdmin2 extends Empleado2 {
    double sueldoMensual;

    /**
     * Metodo constructor
     * @param sueldoMensual
     * @param nombre
     * @param departamento
     * @param puesto
     */
    public EmpAdmin2(double sueldoMensual, String nombre, String departamento, String puesto ){
        this.sueldoMensual = sueldoMensual;
        this.nombre = nombre;
        this.departamento = departamento;
        this.puesto = puesto;
    }

    /**
     * Metodo para obtener la quincena
     * @return quincena
     */
    @Override
    public void calcularQuincena() {
    quincena = sueldoMensual/2;

    }
}
