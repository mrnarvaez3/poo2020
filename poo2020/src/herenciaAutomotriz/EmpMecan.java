package herenciaAutomotriz;
// Clase hija de Empleado
public class EmpMecan extends Empleado{
    double precioTrabajo, quincena;

    /**
     * Metodo constructor
     * @param precioTrabajo
     * @param nombre
     * @param departamento
     * @param puesto
     */
    public EmpMecan(double precioTrabajo, String nombre, String departamento, String puesto ){
        this.precioTrabajo = precioTrabajo;
        this.nombre = nombre;
        this.departamento = departamento;
        this.puesto = puesto;
    }
    /**
     * Metodo para obtener la quincena
     * @return quincena
     */
    public double quincenaMecan(){
        quincena = 0.04 * precioTrabajo;
        return quincena;
    }
}
