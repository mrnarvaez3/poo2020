package herenciaAutomotriz;

public class EmpMecan extends Empleado{
    double precioTrabajo, quincena;

    public EmpMecan(double precioTrabajo, String nombre, String departamento, String puesto ){
        this.precioTrabajo = precioTrabajo;
        this.nombre = nombre;
        this.departamento = departamento;
        this.puesto = puesto;
    }

    public double quincenaMecan(){
        quincena = 0.04 * precioTrabajo;
        return quincena;
    }
}
