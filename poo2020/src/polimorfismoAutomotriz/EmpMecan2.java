package polimorfismoAutomotriz;

// Clase hija de Empleado
public class EmpMecan2 extends Empleado2 {
    double precioTrabajo;

    /**
     * Metodo constructor
     * @param precioTrabajo
     * @param nombre
     * @param departamento
     * @param puesto
     */
    public EmpMecan2(double precioTrabajo, String nombre, String departamento, String puesto ){
        this.precioTrabajo = precioTrabajo;
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
        quincena = 0.04 * precioTrabajo;

    }
}
