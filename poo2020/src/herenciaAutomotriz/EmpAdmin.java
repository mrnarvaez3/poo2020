package herenciaAutomotriz;
// Clase hija de Empleado
public class EmpAdmin extends Empleado{
    double sueldoMensual, quincena;

    /**
     * Metodo constructor
     * @param sueldoMensual
     * @param nombre
     * @param departamento
     * @param puesto
     */
    public EmpAdmin(double sueldoMensual, String nombre, String departamento, String puesto ){
        this.sueldoMensual = sueldoMensual;
        this.nombre = nombre;
        this.departamento = departamento;
        this.puesto = puesto;
    }

    /**
     * Metodo para obtener la quincena
     * @return quincena
     */
    public double quincenaAdmin(){
        quincena = sueldoMensual/2;
        return quincena;
    }
}
